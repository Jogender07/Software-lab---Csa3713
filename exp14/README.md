# Exercise 14: Automate Checkbox and Radio Button Selection using Selenium WebDriver (Selenium)

## Aim
To write a Selenium WebDriver program to automate checkbox and radio button selection.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `selenium-java` (Selenium 4) dependency to `pom.xml`. Selenium Manager downloads the browser driver automatically.
2. **Step 2:** Open the checkboxes page and collect all the check boxes using `findElements()`.
3. **Step 3:** Read the initial state of both check boxes using `isSelected()`; select the first one and clear the second one using `click()`.
4. **Step 4:** Open the web form page and select the second radio button using `click()`.
5. **Step 5:** Print the state of the check boxes and the radio buttons after the click to verify the selection.
6. **Step 6:** Close the browser and stop.

## Program Code

### Exercise14.java
`java
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Exercise14 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/checkboxes");
            List<WebElement> boxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
            System.out.println("Checkbox 1 initially selected : " + boxes.get(0).isSelected());
            System.out.println("Checkbox 2 initially selected : " + boxes.get(1).isSelected());
            if (!boxes.get(0).isSelected()) boxes.get(0).click();
            if (boxes.get(1).isSelected()) boxes.get(1).click();
            System.out.println("Checkbox 1 after click : " + boxes.get(0).isSelected());
            System.out.println("Checkbox 2 after click : " + boxes.get(1).isSelected());
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");
            driver.findElement(By.id("my-radio-2")).click();
            System.out.println("Radio 1 selected : " + driver.findElement(By.id("my-radio-1")).isSelected());
            System.out.println("Radio 2 selected : " + driver.findElement(By.id("my-radio-2")).isSelected());
        } finally {
            driver.quit();
        }
    }
}
`


## Execution Instructions
```bash
mvn exec:java -Dexec.mainClass="com.csa37.co1.ex14.Exercise14"
```

## Expected Output
```
Checkbox 1 initially selected : false
Checkbox 2 initially selected : true
Checkbox 1 after click : true
Checkbox 2 after click : false
Radio 1 selected : false
Radio 2 selected : true
```

## Actual Execution Status
Implemented toggling checkboxes on The Internet Herokuapp and selecting radio buttons on Selenium web form.

## Result
Thus the Selenium WebDriver program to automate checkbox and radio button selection was executed successfully and the output was verified.
