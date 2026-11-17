import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            LoginPage loginPage = new LoginPage(driver).open();
            loginPage.login("standard_user", "secret_sauce");
            System.out.println("Valid login page title : " + new InventoryPage(driver).heading());
            loginPage.open();
            loginPage.login("standard_user", "wrong_pass");
            System.out.println("Invalid login message  : " + loginPage.errorText());
        } finally {
            driver.quit();
        }
    }
}
