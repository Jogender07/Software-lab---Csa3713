# Exercise 31: Execute Black-Box Testing on a Login Page using Selenium WebDriver (Selenium)

## Aim
To write a Selenium WebDriver program to execute black-box testing on a login page.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `selenium-java` (Selenium 4) dependency to `pom.xml`. Selenium Manager downloads the browser driver automatically.
2. **Step 2:** Prepare four black-box test cases without looking at the code: valid login, wrong password, blank user name and blank password, with the expected result of each.
3. **Step 3:** Store the test cases in a two dimensional array (user name, password, expected result).
4. **Step 4:** For every test case delete the cookies, open the login page, enter the data and click the Login button.
5. **Step 5:** Compare the actual result (the URL or the error message) with the expected result and display PASS or FAIL.
6. **Step 6:** Close the browser and stop.

## Program Code
- `Exercise31.java`

## Execution Instructions
```bash
mvn exec:java -Dexec.mainClass="com.csa37.co2.ex31.Exercise31"
```

## Expected Output
```
TC1 : PASS
TC2 : PASS
TC3 : PASS
TC4 : PASS
```

## Actual Execution Status
Configured with cookie cleanup between iterations on SauceDemo.

## Result
Thus the Selenium WebDriver program to execute black-box testing on a login page was executed successfully and the output was verified.
