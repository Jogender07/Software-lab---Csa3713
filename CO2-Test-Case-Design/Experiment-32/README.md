# Exercise 32: Implement Data-Driven Testing of a Login Page using JUnit Parameterized Tests and Selenium (Selenium)

## Aim
To write a Selenium WebDriver program to implement data-driven testing of a login page using JUnit parameterized tests and Selenium.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the dependencies `selenium-java` and `junit-jupiter` to `pom.xml`.
2. **Step 2:** Write the test class `LoginDataDrivenTest`. Create the `ChromeDriver` in `@BeforeEach` and close it in `@AfterEach`.
3. **Step 3:** Write a `@ParameterizedTest` with `@CsvSource` whose rows contain the user name, the password and the expected result (page title or error message).
4. **Step 4:** In the test method enter the data, click Login and read the actual result. Use `assertEquals()` to compare the actual and expected results.
5. **Step 5:** Run the class using `mvn test` and verify that the test runs once for every data row.
6. **Step 6:** Stop.

## Program Code
- `LoginDataDrivenTest.java`

## Execution Instructions
```bash
mvn test -Dtest=LoginDataDrivenTest
```

## Expected Output
```
[INFO] Running com.csa37.co2.ex32.LoginDataDrivenTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## Actual Execution Status
Implemented combining JUnit 5 Parameterized tests with Selenium WebDriver 4.

## Result
Thus the Selenium WebDriver program to implement data-driven testing of a login page using JUnit parameterized tests and Selenium was executed successfully and the output was verified.
