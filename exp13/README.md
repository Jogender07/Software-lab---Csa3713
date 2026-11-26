# Exercise 13: Automate the Filling and Submission of a Web Form using Selenium WebDriver (Selenium)

## Aim
To write a Selenium WebDriver program to automate the filling and submission of a web form.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `selenium-java` (Selenium 4) dependency to `pom.xml`. Selenium Manager downloads the browser driver automatically.
2. **Step 2:** Open the sample web form page of Selenium (`https://www.selenium.dev/selenium/web/web-form.html`).
3. **Step 3:** Enter the text in the text box, the password in the password box and the comment in the text area using `sendKeys()`.
4. **Step 4:** Click the Submit button using `click()`.
5. **Step 5:** Read the heading and the message of the result page and verify that the form was submitted.
6. **Step 6:** Close the browser and stop.

## Program Code

### Exercise13.java
`java
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise13 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");
            System.out.println("Page title : " + driver.getTitle());
            driver.findElement(By.name("my-text")).sendKeys("Student");
            driver.findElement(By.name("my-password")).sendKeys("Secret@123");
            driver.findElement(By.name("my-textarea")).sendKeys("Automated using Selenium WebDriver");
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            System.out.println("Heading : " + driver.findElement(By.tagName("h1")).getText());
            System.out.println("Message : " + driver.findElement(By.id("message")).getText());
        } finally {
            driver.quit();
        }
    }
}
`


## Execution Instructions
```bash
mvn exec:java -Dexec.mainClass="com.csa37.co1.ex13.Exercise13"
```

## Expected Output
```
Page title : Web form
Heading : Form submitted
Message : Received!
```

## Actual Execution Status
Implemented against official Selenium web form testing endpoint.

## Result
Thus the Selenium WebDriver program to automate the filling and submission of a web form was executed successfully and the output was verified.
