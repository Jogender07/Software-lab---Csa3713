# Exercise 11: Open Chrome using Selenium WebDriver and Verify Title and URL (Selenium)

## Aim
To write a Selenium WebDriver program to open the Chrome browser and verify the title and URL of a web page.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `selenium-java` (Selenium 4) dependency to `pom.xml`. Selenium Manager downloads the browser driver automatically.
2. **Step 2:** Create the `ChromeDriver` object and maximize the browser window.
3. **Step 3:** Open the web page using `driver.get()` and read the title using `getTitle()` and the URL using `getCurrentUrl()`.
4. **Step 4:** Compare the title with the expected title "Swag Labs" and display PASS or FAIL.
5. **Step 5:** Close all the browser windows using `driver.quit()` in the finally block.
6. **Step 6:** Stop.

## Program Code
- `Exercise11.java`

## Execution Instructions
```bash
# From repository root
mvn exec:java -Dexec.mainClass="com.csa37.co1.ex11.Exercise11"
# OR compile and run standalone
javac -cp ".;lib/*" Exercise11.java
java -cp ".;lib/*" Exercise11
```

## Expected Output
```
Page title : Swag Labs
Current URL : https://www.saucedemo.com/
Title verification : PASS
```

## Actual Execution Status
Implemented with Selenium WebDriver 4 and ChromeDriver with automatic Selenium Manager driver discovery.

## Result
Thus the Selenium WebDriver program to open the Chrome browser and verify the title and URL of a web page was executed successfully and the output was verified.
