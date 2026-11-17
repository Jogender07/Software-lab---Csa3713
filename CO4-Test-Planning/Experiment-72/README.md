# Experiment 72: Data-Driven Testing from CSV File Using Selenium WebDriver

## 1. Aim
To write a Selenium WebDriver program to create a data-driven test script that reads the test data from a CSV file.

## 2. Algorithm
1. Start the program, create a Maven project and add the `selenium-java` (Selenium 4) dependency to `pom.xml`. Selenium Manager downloads the browser driver automatically.
2. Create the file `users.csv` in the project folder. The first line is the header and every other line contains the username, password and expected result separated by the `|` character.
3. Read all the lines of the file using `Files.readAllLines()` and skip the header line.
4. For every line split the data, open the login page, enter username and password and click Login.
5. Read the actual result (page heading or error message), compare it with the expected result and print PASS or FAIL for every row.
6. Close the browser and stop.

## 3. Program & Test Data
- Data: [users.csv](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-72/users.csv)
- Script: [Exercise72.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-72/Exercise72.java)

## 4. Execution Instructions
```powershell
mvn test-compile
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co4.ex72.Exercise72
```

## 5. Expected Output
```
Row 1 : standard_user / secret_sauce -> PASS
Row 2 : standard_user / wrong_pass -> PASS
Row 3 : locked_out_user / secret_sauce -> PASS
```

## 6. Actual Execution Status
- CSV parsing and automated data-driven execution verified.
- Status: **VERIFIED**.

## 7. Result
Thus the Selenium WebDriver program to create a data-driven test script that reads the test data from a CSV file was executed successfully and the output was verified.
