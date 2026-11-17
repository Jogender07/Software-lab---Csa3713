import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exercise94 {
    public static void main(String[] args) throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new", "--window-size=1920,1080");
        WebDriver driver = new ChromeDriver(options);
        try {
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            String heading = driver.findElement(By.className("title")).getText();
            int products = driver.findElements(By.className("inventory_item")).size();
            System.out.println("Browser mode        : headless");
            System.out.println("Products page title : " + heading);
            System.out.println("Products listed     : " + products);
            System.out.println("Headless smoke test : "
                    + (heading.equals("Products") && products == 6 ? "PASS" : "FAIL"));
        } finally {
            driver.quit();
        }
    }
}
