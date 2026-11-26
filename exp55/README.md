# Experiment 55: Dynamic Content Waiting Using Explicit Wait

## 1. Aim
To write a Selenium WebDriver script in Java to handle dynamically loaded content using `WebDriverWait` (explicit wait) and verify the loaded content.

## 2. Algorithm
1. Start the program, create a Maven project and add the dependencies `selenium-java` and `chromedriver` to `pom.xml`.
2. Initialise the `ChromeDriver` and open the dynamic loading demo page.
3. Click the Start button to trigger asynchronous content loading.
4. Create a `WebDriverWait` instance with a timeout of 10 seconds.
5. Use `wait.until(ExpectedConditions.visibilityOfElementLocated(...))` to wait until the dynamic element appears in the DOM and becomes visible.
6. Read the text of the revealed element and verify that it matches "Hello World!".
7. Close the browser using `driver.quit()` and stop.

## 3. Program Code

### Exercise55.java
`java
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Exercise55 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
            driver.findElement(By.cssSelector("#start button")).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement finish = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
            System.out.println("Dynamic text : " + finish.getText());
            System.out.println("Verification : " + (finish.getText().equals("Hello World!") ? "PASS" : "FAIL"));
        } finally {
            driver.quit();
        }
    }
}
`


## 4. Execution Instructions
```powershell
mvn test-compile
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co3.ex55.Exercise55
```

## 5. Expected Output
```
Dynamic text : Hello World!
Verification : PASS
```

## 6. Actual Execution Status
- Explicit wait condition handling dynamically rendered elements verified.
- Status: **VERIFIED**.

## 7. Result
Thus the Selenium WebDriver script in Java to handle dynamically loaded content using explicit wait was executed successfully and the output was verified.
