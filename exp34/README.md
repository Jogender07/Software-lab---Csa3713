# Exercise 34: Test the Boundary Values of a Numeric Input Field using Selenium WebDriver (Selenium)

## Aim
To write a Selenium WebDriver program to test the boundary values of a numeric input field.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `selenium-java` (Selenium 4) dependency to `pom.xml`. Selenium Manager downloads the browser driver automatically.
2. **Step 2:** Create an HTML number field with the valid range 18 to 60 using JavascriptExecutor (`about:blank` page).
3. **Step 3:** Identify the boundary values of the range: 17, 18, 19, 59, 60 and 61.
4. **Step 4:** For every value clear the field, enter the value using `sendKeys()` and call the HTML5 method `checkValidity()` using JavascriptExecutor.
5. **Step 5:** Print the validity of every value and verify that 18 to 60 are valid and 17 and 61 are invalid.
6. **Step 6:** Close the browser and stop.

## Program Code

### Exercise34.java
`java
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise34 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            driver.get("about:blank");
            js.executeScript("document.body.innerHTML = \"<input id='age' type='number' min='18' max='60'>\";");
            int[] values = {17, 18, 19, 59, 60, 61};
            for (int v : values) {
                WebElement age = driver.findElement(By.id("age"));
                age.clear();
                age.sendKeys(String.valueOf(v));
                Boolean valid = (Boolean) js.executeScript("return arguments[0].checkValidity();", age);
                System.out.println("Age " + v + " -> valid = " + valid);
            }
        } finally {
            driver.quit();
        }
    }
}
`


## Execution Instructions
```bash
mvn exec:java -Dexec.mainClass="com.csa37.co2.ex34.Exercise34"
```

## Expected Output
```
Age 17 -> valid = false
Age 18 -> valid = true
Age 19 -> valid = true
Age 59 -> valid = true
Age 60 -> valid = true
Age 61 -> valid = false
```

## Actual Execution Status
Implemented using dynamic HTML DOM injection and HTML5 `checkValidity()` API execution via `JavascriptExecutor`.

## Result
Thus the Selenium WebDriver program to test the boundary values of a numeric input field was executed successfully and the output was verified.
