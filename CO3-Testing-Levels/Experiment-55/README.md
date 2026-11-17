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

## 3. Program
- [Exercise55.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-55/Exercise55.java)

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
