# Experiment 93: Automated Page Load Time Performance Monitoring

## 1. Aim
To write a Selenium WebDriver program to measure and monitor the page load time of web pages against a performance limit.

## 2. Algorithm
1. Start the program, create a Maven project and add the `selenium-java` (Selenium 4) dependency to `pom.xml`. Selenium Manager downloads the browser driver automatically.
2. Define the list of page URLs to monitor and set the acceptable load time limit (5000 milliseconds).
3. For each page record the start time using `System.currentTimeMillis()`.
4. Open the page using `driver.get(page)` (which blocks until the page is loaded).
5. Calculate the elapsed load time by subtracting start time from the current time.
6. Print the URL, the load time in milliseconds and PASS if load time <= limit, else FAIL.
7. Close the browser and stop.

## 3. Program
- [Exercise93.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-93/Exercise93.java)

## 4. Execution Instructions
```powershell
mvn test-compile
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co5.ex93.Exercise93
```

## 5. Expected Output
```
https://www.saucedemo.com -> <time> ms -> PASS
https://the-internet.herokuapp.com -> <time> ms -> PASS
```

## 6. Actual Execution Status
- Page load SLA timing verification verified.
- Status: **VERIFIED**.

## 7. Result
Thus the Selenium WebDriver program to measure and monitor the page load time of web pages was executed successfully and the output was verified.
