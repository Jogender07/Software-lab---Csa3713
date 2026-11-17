# Experiment 74: Cross-Browser Testing with Chrome and Firefox Using JUnit 5

## 1. Aim
To write a Selenium WebDriver program to execute the same test case on Chrome and Firefox using JUnit and Selenium.

## 2. Algorithm
1. Start the program, create a Maven project and add the dependencies `selenium-java` and `junit-jupiter` to `pom.xml`. Install Chrome and Firefox in the system.
2. Write the test class `CrossBrowserTest` with a `@ParameterizedTest` and `@ValueSource(strings = {"chrome", "firefox"})`.
3. In the test method create `ChromeDriver` or `FirefoxDriver` depending on the value of the parameter.
4. Open the web page and verify the title using `assertEquals()`. Close the browser in the finally block.
5. Run the class using `mvn test` and verify that the test case executes once in every browser.
6. Stop.

## 3. Program
- [CrossBrowserTest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-74/CrossBrowserTest.java)

## 4. Execution Instructions
```powershell
mvn test -Dtest=com.csa37.co4.ex74.CrossBrowserTest
```

## 5. Expected Output
```
[INFO] Running CrossBrowserTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 6. Actual Execution Status
- Parameterized multi-browser driver abstraction verified.
- Status: **VERIFIED**.

## 7. Result
Thus the Selenium WebDriver program to execute the same test case on Chrome and Firefox using JUnit and Selenium was executed successfully and the output was verified.
