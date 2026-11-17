import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise93 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            String[] pages = {"https://www.saucedemo.com", "https://the-internet.herokuapp.com"};
            long limit = 5000; // acceptable load time in milliseconds
            for (String page : pages) {
                long start = System.currentTimeMillis();
                driver.get(page);
                long loadTime = System.currentTimeMillis() - start;
                System.out.println(page + " -> " + loadTime + " ms -> "
                        + (loadTime <= limit ? "PASS" : "FAIL"));
            }
        } finally {
            driver.quit();
        }
    }
}
