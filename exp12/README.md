# Exercise 12: Locate Web Elements using id, name, class name, CSS Selector and XPath (Selenium)

## Aim
To write a Selenium WebDriver program to locate web elements using id, name, class name, CSS selector and XPath.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `selenium-java` (Selenium 4) dependency to `pom.xml`. Selenium Manager downloads the browser driver automatically.
2. **Step 2:** Open the login page of the demo web site.
3. **Step 3:** Locate the user name field using `By.id()`, the password field using `By.name()` and the logo using `By.className()`.
4. **Step 4:** Locate the login button using `By.cssSelector()` and the logo again using `By.xpath()`.
5. **Step 5:** Print the attribute or the text of every located element to confirm that the locator works.
6. **Step 6:** Close the browser and stop.

## Program Code

### Exercise12.java
`java
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise12 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com");
            WebElement byId = driver.findElement(By.id("user-name"));
            WebElement byName = driver.findElement(By.name("password"));
            WebElement byClass = driver.findElement(By.className("login_logo"));
            WebElement byCss = driver.findElement(By.cssSelector("input[type='submit']"));
            WebElement byXpath = driver.findElement(By.xpath("//div[@class='login_logo']"));
            System.out.println("By id          : placeholder = " + byId.getAttribute("placeholder"));
            System.out.println("By name        : placeholder = " + byName.getAttribute("placeholder"));
            System.out.println("By className   : text = " + byClass.getText());
            System.out.println("By cssSelector : value = " + byCss.getAttribute("value"));
            System.out.println("By xpath       : text = " + byXpath.getText());
        } finally {
            driver.quit();
        }
    }
}
`


## Execution Instructions
```bash
# From repository root
mvn exec:java -Dexec.mainClass="com.csa37.co1.ex12.Exercise12"
```

## Expected Output
```
By id          : placeholder = Username
By name        : placeholder = Password
By className   : text = Swag Labs
By cssSelector : value = Login
By xpath       : text = Swag Labs
```

## Actual Execution Status
Implemented using all 5 core locator strategies on standard SauceDemo login DOM.

## Result
Thus the Selenium WebDriver program to locate web elements using id, name, class name, CSS selector and XPath was executed successfully and the output was verified.
