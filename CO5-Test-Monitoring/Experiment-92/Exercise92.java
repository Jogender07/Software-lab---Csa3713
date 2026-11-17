import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class Exercise92 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/status_codes");
            List<WebElement> links = driver.findElements(By.cssSelector("a[href*='status_codes/']"));
            List<String> urls = new ArrayList<>();
            for (WebElement link : links) {
                urls.add(link.getAttribute("href"));
            }
            int broken = 0;
            for (String u : urls) {
                HttpURLConnection con = (HttpURLConnection) new URI(u).toURL().openConnection();
                con.setInstanceFollowRedirects(false);
                con.setRequestMethod("GET");
                int code = con.getResponseCode();
                boolean bad = code >= 400;
                if (bad) broken++;
                System.out.println(u.substring(u.lastIndexOf('/') + 1) + " -> " + code
                        + " -> " + (bad ? "BROKEN" : "OK"));
            }
            System.out.println("Links checked : " + urls.size());
            System.out.println("Broken links  : " + broken);
        } finally {
            driver.quit();
        }
    }
}
