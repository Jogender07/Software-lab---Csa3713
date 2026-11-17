# Experiment 53: Smoke Testing - Automated Page Headings & Navigation Verification

## 1. Aim
To write a Selenium WebDriver script in Java to execute smoke testing on a web application by verifying that the critical pages load and their primary headings are displayed correctly.

## 2. Algorithm
1. Start the program, create a Maven project and add the dependencies `selenium-java` and `chromedriver` to `pom.xml`.
2. Initialise the `ChromeDriver` and define a list of critical page URLs and their expected headings.
3. Loop through each URL: open the page using `driver.get()`, locate the main heading element using a CSS selector or XPath, and compare the text with the expected value.
4. Print the pass or fail status for each page.
5. After all pages are checked, print a summary of the smoke test results.
6. Close the browser using `driver.quit()` and stop.

## 3. Program
- [Exercise53.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-53/Exercise53.java)

## 4. Execution Instructions
```powershell
mvn test-compile
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co3.ex53.Exercise53
```

## 5. Expected Output
```
Smoke / -> Welcome to the-internet -> PASS
Smoke /login -> Login Page -> PASS
Smoke /checkboxes -> Checkboxes -> PASS
Smoke /dropdown -> Dropdown List -> PASS
Smoke test result : 4/4 passed
```

## 6. Actual Execution Status
- Iterative multi-page navigation and header validation verified.
- Status: **VERIFIED**.

## 7. Result
Thus the Selenium WebDriver script in Java to execute smoke testing by verifying critical pages and headings was executed successfully and the output was verified.
