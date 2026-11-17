# Exercise 15: Capture a Screenshot of a Web Page and Store Locally using Selenium WebDriver (Selenium)

## Aim
To write a Selenium WebDriver program to capture a screenshot of a web page and store it in the local system.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `selenium-java` (Selenium 4) dependency to `pom.xml`. Selenium Manager downloads the browser driver automatically.
2. **Step 2:** Open the web page using `driver.get()`.
3. **Step 3:** Cast the driver to `TakesScreenshot` and call `getScreenshotAs(OutputType.FILE)` to capture the page as a temporary file.
4. **Step 4:** Create the folder `screenshots` and copy the temporary file into it as `home_page.png` using `Files.copy()`.
5. **Step 5:** Print the path of the saved file and verify that the image is created.
6. **Step 6:** Stop.

## Program Code
- `Exercise15.java`

## Execution Instructions
```bash
mvn exec:java -Dexec.mainClass="com.csa37.co1.ex15.Exercise15"
```

## Expected Output
```
Screenshot saved at : <project-folder>/screenshots/home_page.png
```

## Actual Execution Status
Implemented using `TakesScreenshot` interface with automatic folder creation and file persistence.

## Result
Thus the Selenium WebDriver program to capture a screenshot of a web page and store it in the local system was executed successfully and the output was verified.
