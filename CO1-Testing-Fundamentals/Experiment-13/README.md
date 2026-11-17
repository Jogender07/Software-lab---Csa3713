# Exercise 13: Automate the Filling and Submission of a Web Form using Selenium WebDriver (Selenium)

## Aim
To write a Selenium WebDriver program to automate the filling and submission of a web form.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `selenium-java` (Selenium 4) dependency to `pom.xml`. Selenium Manager downloads the browser driver automatically.
2. **Step 2:** Open the sample web form page of Selenium (`https://www.selenium.dev/selenium/web/web-form.html`).
3. **Step 3:** Enter the text in the text box, the password in the password box and the comment in the text area using `sendKeys()`.
4. **Step 4:** Click the Submit button using `click()`.
5. **Step 5:** Read the heading and the message of the result page and verify that the form was submitted.
6. **Step 6:** Close the browser and stop.

## Program Code
- `Exercise13.java`

## Execution Instructions
```bash
mvn exec:java -Dexec.mainClass="com.csa37.co1.ex13.Exercise13"
```

## Expected Output
```
Page title : Web form
Heading : Form submitted
Message : Received!
```

## Actual Execution Status
Implemented against official Selenium web form testing endpoint.

## Result
Thus the Selenium WebDriver program to automate the filling and submission of a web form was executed successfully and the output was verified.
