# Experiment 95: Defect Screenshot Capture and Error Evidence Archiving

## 1. Aim
To write a Selenium WebDriver program to capture and archive screenshot evidence when verifying an error state.

## 2. Algorithm
1. Start the program, create a Maven project and add the `selenium-java` (Selenium 4) dependency to `pom.xml`. Selenium Manager downloads the browser driver automatically.
2. Open the login page and enter credentials of a locked-out user (`locked_out_user` / `secret_sauce`).
3. Click the login button to trigger the locked-out error banner.
4. Read the displayed error text and verify that it matches "Epic sadface: Sorry, this user has been locked out.".
5. Capture a screenshot of the browser window using `TakesScreenshot.getScreenshotAs(OutputType.FILE)`.
6. Save the screenshot to `evidence/defect_locked_user.png` so that it can be attached to the defect report in JIRA.
7. Close the browser and stop.

## 3. Program
- [Exercise95.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-95/Exercise95.java)

## 4. Execution Instructions
```powershell
mvn test-compile
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co5.ex95.Exercise95
```

## 5. Expected Output
```
Error message     : Epic sadface: Sorry, this user has been locked out.
Message verified  : true
Evidence saved at : evidence/defect_locked_user.png
```

## 6. Actual Execution Status
- Defect verification and screenshot evidence creation verified.
- Status: **VERIFIED**.

## 7. Result
Thus the Selenium WebDriver program to capture and archive screenshot evidence was executed successfully and the output was verified.
