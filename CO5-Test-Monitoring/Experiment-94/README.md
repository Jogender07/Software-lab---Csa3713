# Experiment 94: Headless Browser Smoke Testing with ChromeOptions

## 1. Aim
To write a Selenium WebDriver program to run an automated smoke test in headless mode for CI/CD pipelines.

## 2. Algorithm
1. Start the program, create a Maven project and add the `selenium-java` (Selenium 4) dependency to `pom.xml`.
2. Configure `ChromeOptions` with `--headless=new` and `--window-size=1920,1080` so that Chrome runs without opening a visible browser window.
3. Pass the `ChromeOptions` to `ChromeDriver` constructor.
4. Open the login page, enter credentials and click login.
5. Verify that the product catalogue is displayed (title = "Products") and that 6 products are present.
6. Print the results to confirm that the smoke test passes in headless mode.
7. Close the browser using `driver.quit()` and stop.

## 3. Program
- [Exercise94.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-94/Exercise94.java)

## 4. Execution Instructions
```powershell
mvn test-compile
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co5.ex94.Exercise94
```

## 5. Expected Output
```
Browser mode        : headless
Products page title : Products
Products listed     : 6
Headless smoke test : PASS
```

## 6. Actual Execution Status
- Headless Chrome browser automation verified.
- Status: **VERIFIED**.

## 7. Result
Thus the Selenium WebDriver program to run an automated smoke test in headless mode was executed successfully and the output was verified.
