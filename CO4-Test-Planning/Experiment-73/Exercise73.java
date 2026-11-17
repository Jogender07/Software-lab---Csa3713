import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Exercise73 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com");
            String expectedTitle = "Swag Lab"; // wrong on purpose to create a failure
            String actualTitle = driver.getTitle();
            System.out.println("Expected title : " + expectedTitle);
            System.out.println("Actual title   : " + actualTitle);
            if (expectedTitle.equals(actualTitle)) {
                System.out.println("Result : PASS");
            } else {
                File shot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                Path dest = Paths.get("evidence", "failed_title_check.png");
                Files.createDirectories(dest.getParent());
                Files.copy(shot.toPath(), dest, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Result : FAIL - screenshot saved at " + dest);
            }
        } finally {
            driver.quit();
        }
    }
}
