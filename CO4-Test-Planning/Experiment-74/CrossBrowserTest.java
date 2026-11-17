import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CrossBrowserTest {
    @ParameterizedTest(name = "browser = {0}")
    @ValueSource(strings = {"chrome", "firefox"})
    void titleIsSameInAllBrowsers(String browser) {
        WebDriver driver = browser.equals("firefox") ? new FirefoxDriver() : new ChromeDriver();
        try {
            driver.get("https://www.saucedemo.com");
            assertEquals("Swag Labs", driver.getTitle());
        } finally {
            driver.quit();
        }
    }
}
