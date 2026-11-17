# Experiment 91: Automated Execution Status Logging to CSV in Selenium

## 1. Aim
To write a Selenium WebDriver program to log test results to a CSV file and calculate the pass percentage.

## 2. Algorithm
1. Start the program, create a Maven project and add the `selenium-java` (Selenium 4) dependency to `pom.xml`. Selenium Manager downloads the browser driver automatically.
2. Define three test checks: check 1 verify the home page title, check 2 verify the heading of the login page and check 3 verify the number of checkboxes on the checkboxes page.
3. Execute each check, record the boolean result and build a list of log entries with TC_ID, Description and PASS or FAIL.
4. Write the log entries to the file `results.csv` using `Files.write()`.
5. Print the log to the console, calculate the number of passed tests and print the pass percentage.
6. Close the browser and stop.

## 3. Program
- [Exercise91.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-91/Exercise91.java)

## 4. Execution Instructions
```powershell
mvn test-compile
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co5.ex91.Exercise91
```

## 5. Expected Output
```
TC_ID,Description,Status
TC01,Home page title,PASS
TC02,Login page heading,PASS
TC03,Checkbox count,PASS
Passed 3 of 3 | Pass percentage = 100.00%
```

## 6. Actual Execution Status
- CSV logging and pass rate metrics verified.
- Status: **VERIFIED**.

## 7. Result
Thus the Selenium WebDriver program to log test results to a CSV file and calculate the pass percentage was executed successfully and the output was verified.
