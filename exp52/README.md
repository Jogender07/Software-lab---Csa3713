# Experiment 52: System Testing - End-to-End Checkout Flow Automation

## 1. Aim
To write a Selenium WebDriver script in Java to execute system testing for an end-to-end checkout process of an e-commerce website.

## 2. Algorithm
1. Start the program, create a Maven project and add the dependencies `selenium-java` and `chromedriver` to `pom.xml`.
2. Initialise the `ChromeDriver` and open the e-commerce home page.
3. Login using valid credentials and navigate to the product catalogue.
4. Add an item to the cart and verify that the cart icon updates with the correct item count.
5. Navigate to the checkout page, enter the shipping address and payment details.
6. Submit the order and verify the confirmation message.
7. Close the browser using `driver.quit()` and stop.

## 3. Program Code

### Exercise52.java
`java
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise52 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
            String badge = driver.findElement(By.className("shopping_cart_badge")).getText();
            System.out.println("Cart badge count : " + badge);
            driver.findElement(By.className("shopping_cart_link")).click();
            driver.findElement(By.id("checkout")).click();
            driver.findElement(By.id("first-name")).sendKeys("Test");
            driver.findElement(By.id("last-name")).sendKeys("User");
            driver.findElement(By.id("postal-code")).sendKeys("600001");
            driver.findElement(By.id("continue")).click();
            driver.findElement(By.id("finish")).click();
            String status = driver.findElement(By.className("complete-header")).getText();
            System.out.println("Order status     : " + status);
            System.out.println("System test      : "
                    + (badge.equals("1") && status.equals("Thank you for your order!") ? "PASS" : "FAIL"));
        } finally {
            driver.quit();
        }
    }
}
`


## 4. Execution Instructions
```powershell
mvn test-compile
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co3.ex52.Exercise52
```

## 5. Expected Output
```
Cart badge count : 1
Order status     : Thank you for your order!
System test      : PASS
```

## 6. Actual Execution Status
- Complete end-to-end checkout automation script verified with Selenium 4.
- Status: **VERIFIED**.

## 7. Result
Thus the Selenium WebDriver script in Java to execute system testing for an end-to-end checkout process was executed successfully and the output was verified.
