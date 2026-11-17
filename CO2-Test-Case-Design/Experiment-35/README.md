# Exercise 35: Handle JavaScript Alert, Confirm and Prompt Pop-ups using Selenium WebDriver (Selenium)

## Aim
To write a Selenium WebDriver program to handle JavaScript alert, confirm and prompt pop-ups.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `selenium-java` (Selenium 4) dependency to `pom.xml`. Selenium Manager downloads the browser driver automatically.
2. **Step 2:** Open the JavaScript alerts page (`https://the-internet.herokuapp.com/javascript_alerts`).
3. **Step 3:** Click the JS Alert button, switch to the alert using `driver.switchTo().alert()`, print its text and accept it.
4. **Step 4:** Click the JS Confirm button and dismiss it. Click the JS Prompt button, enter a text using `sendKeys()` and accept it.
5. **Step 5:** Read the result text displayed on the page after every pop-up and verify it.
6. **Step 6:** Close the browser and stop.

## Program Code
- `Exercise35.java`

## Execution Instructions
```bash
mvn exec:java -Dexec.mainClass="com.csa37.co2.ex35.Exercise35"
```

## Expected Output
```
Alert text   : I am a JS Alert
Result       : You successfully clicked an alert
Confirm text : I am a JS Confirm
Result       : You clicked: Cancel
Result       : You entered: Hello Selenium
```

## Actual Execution Status
Implemented covering all 3 alert types with `accept()`, `dismiss()`, and `sendKeys()`.

## Result
Thus the Selenium WebDriver program to handle JavaScript alert, confirm and prompt pop-ups was executed successfully and the output was verified.
