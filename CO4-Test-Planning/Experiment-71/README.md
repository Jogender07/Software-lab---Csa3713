# Experiment 71: Page Object Model (POM) Design Pattern in Selenium

## 1. Aim
To write a Selenium WebDriver program to implement the Page Object Model for a login page.

## 2. Algorithm
1. Start the program, create a Maven project and add the `selenium-java` (Selenium 4) dependency to `pom.xml`. Selenium Manager downloads the browser driver automatically.
2. Create the class `LoginPage` that stores the locators of the login page and has the methods `open()`, `login()` and `errorText()`.
3. Create the class `InventoryPage` that stores the locator of the page heading and has the method `heading()`.
4. Create the test class `LoginTest` that creates the page objects and calls only their methods; the test class does not contain any locator.
5. Run the test for a valid and an invalid login and print the results.
6. If a locator changes only the page class must be changed. Close the browser and stop.

## 3. Program Components
- [LoginPage.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-71/LoginPage.java)
- [InventoryPage.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-71/InventoryPage.java)
- [LoginTest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-71/LoginTest.java)

## 4. Execution Instructions
```powershell
mvn test-compile
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co4.ex71.LoginTest
```

## 5. Expected Output
```
Valid login page title : Products
Invalid login message  : Epic sadface: Username and password do not match any user in this service
```

## 6. Actual Execution Status
- POM architecture implementation verified with Selenium 4.
- Status: **VERIFIED**.

## 7. Result
Thus the Selenium WebDriver program to implement the Page Object Model for a login page was executed successfully and the output was verified.
