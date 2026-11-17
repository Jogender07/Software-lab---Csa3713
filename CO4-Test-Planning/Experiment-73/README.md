# Experiment 73: Capturing Screenshots as Test Evidence on Failure

## 1. Aim
To write a Selenium WebDriver program to capture a screenshot as test evidence when a check fails.

## 2. Algorithm
1. Start the program, create a Maven project and add the `selenium-java` (Selenium 4) dependency to `pom.xml`. Selenium Manager downloads the browser driver automatically.
2. Open the web page and read the page title using `driver.getTitle()`.
3. Compare the actual title with an incorrect expected title so that the test fails intentionally.
4. If the check fails cast the driver to `TakesScreenshot` and call `getScreenshotAs(OutputType.FILE)`.
5. Create the folder `evidence` and copy the screenshot file to `evidence/failed_title_check.png`.
6. Print the failure message and the path of the screenshot. Close the browser and stop.

## 3. Program
- [Exercise73.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-73/Exercise73.java)

## 4. Execution Instructions
```powershell
mvn test-compile
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co4.ex73.Exercise73
```

## 5. Expected Output
```
Expected title : Swag Lab
Actual title   : Swag Labs
Result : FAIL - screenshot saved at evidence/failed_title_check.png
```

## 6. Actual Execution Status
- Screenshot capture upon assertion failure verified.
- Status: **VERIFIED**.

## 7. Result
Thus the Selenium WebDriver program to capture a screenshot as test evidence when a check fails was executed successfully and the output was verified.
