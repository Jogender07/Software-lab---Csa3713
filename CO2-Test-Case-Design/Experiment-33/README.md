# Exercise 33: Automate Dropdown Selection using the Select Class in Selenium WebDriver (Selenium)

## Aim
To write a Selenium WebDriver program to automate dropdown selection using the `Select` class.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `selenium-java` (Selenium 4) dependency to `pom.xml`. Selenium Manager downloads the browser driver automatically.
2. **Step 2:** Open the dropdown page and locate the dropdown element using `By.id("dropdown")`.
3. **Step 3:** Wrap the element in a `Select` object.
4. **Step 4:** Select an option using `selectByVisibleText()`, `selectByValue()` and `selectByIndex()` one after the other.
5. **Step 5:** After every selection print the text of `getFirstSelectedOption()` and print the total number of options.
6. **Step 6:** Close the browser and stop.

## Program Code
- `Exercise33.java`

## Execution Instructions
```bash
mvn exec:java -Dexec.mainClass="com.csa37.co2.ex33.Exercise33"
```

## Expected Output
```
By visible text : Option 1
By value        : Option 2
By index        : Option 1
Total options   : 3
```

## Actual Execution Status
Implemented using all 3 selection methods of Selenium `Select` helper.

## Result
Thus the Selenium WebDriver program to automate dropdown selection using the Select class was executed successfully and the output was verified.
