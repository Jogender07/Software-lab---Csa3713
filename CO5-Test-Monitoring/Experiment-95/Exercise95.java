import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Exercise95 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            String message = driver.findElement(By.cssSelector("[data-test='error']")).getText();
            String expected = "Epic sadface: Sorry, this user has been locked out.";
            System.out.println("Error message     : " + message);
            System.out.println("Message verified  : " + message.equals(expected));
            File shot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Path dest = Paths.get("evidence", "defect_locked_user.png");
            Files.createDirectories(dest.getParent());
            Files.copy(shot.toPath(), dest, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Evidence saved at : " + dest);
        } finally {
            driver.quit();
        }
    }
}
