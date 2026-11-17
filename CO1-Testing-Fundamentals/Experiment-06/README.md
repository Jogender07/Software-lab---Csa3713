# Exercise 6: Check Whether a Given Year is a Leap Year and Validate using JUnit Assertions (JUnit)

## Aim
To write JUnit test cases to check whether a given year is a leap year and validate the output using JUnit assertions.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. **Step 2:** Write the class `YearUtil` with the method `isLeapYear(int year)` using the rule: divisible by 4 and not by 100, or divisible by 400.
3. **Step 3:** Write the test class `YearUtilTest` with one test for each case: a normal leap year, a century year, a century year divisible by 400 and a non-leap year.
4. **Step 4:** Use `assertTrue()` and `assertFalse()` to verify the result of each case.
5. **Step 5:** Run the tests using `mvn test` and verify the output.
6. **Step 6:** Stop.

## Program Code
- **Implementation:** `YearUtil.java`
- **Test Class:** `YearUtilTest.java`

## Execution Instructions
```bash
# From repository root
mvn test -Dtest=YearUtilTest
```

## Expected Output
```
[INFO] Running com.csa37.co1.ex06.YearUtilTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## Actual Execution Status
Verified and Executed via Maven Surefire test engine. All 4 assertions passed.

## Result
Thus the JUnit test cases to check whether a given year is a leap year and validate the output using JUnit assertions were executed successfully and the output was verified.
