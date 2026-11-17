# Experiment 51: Regression Testing - Automated Login and Logout with Session Verification

## 1. Aim
To write a Selenium WebDriver script in Java to automate the login and logout processes of a web application to verify session management as part of regression testing.

## 2. Algorithm
1. Start the program, create a Maven project and add the dependencies `selenium-java` and `chromedriver` to `pom.xml`.
2. Initialise the `ChromeDriver` and open the login page of the application using `driver.get()`.
3. Locate the username and password fields and enter valid credentials.
4. Click the login button and verify that the user is redirected to the home or dashboard page.
5. Locate and click the logout button or link.
6. Verify that the user is logged out and the login page is displayed again.
7. Close the browser using `driver.quit()` and stop.

## 3. Program
- [Exercise51.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-51/Exercise51.java)

## 4. Execution Instructions
```powershell
mvn test-compile
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co3.ex51.Exercise51
```

## 5. Expected Output
```
Login check  : PASS
Logout check : PASS
```

## 6. Actual Execution Status
- Automated Selenium 4 script verified with Selenium Manager Chrome bindings.
- Status: **VERIFIED**.

## 7. Result
Thus the Selenium WebDriver script in Java to automate the login and logout processes and verify session management was executed successfully and the output was verified.
