# Exercise 5: Calculate the Factorial of a Number and Validate using JUnit Assertions (JUnit)

## Aim
To write JUnit test cases to calculate the factorial of a number and validate the output using JUnit assertions.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. **Step 2:** Write the class `MathUtil` with the method `factorial(int n)` that multiplies the numbers from 2 to n and throws `IllegalArgumentException` for a negative number.
3. **Step 3:** Write the test class `MathUtilTest` and use `assertEquals()` to verify the factorial of 0, 1, 5 and 10.
4. **Step 4:** Use `assertThrows()` to verify that a negative number is rejected.
5. **Step 5:** Run the tests using `mvn test` and verify that all the assertions pass.
6. **Step 6:** Stop.

## Program Code
- **Implementation:** `MathUtil.java`
- **Test Class:** `MathUtilTest.java`

## Execution Instructions
```bash
# From repository root
mvn test -Dtest=MathUtilTest
```

## Expected Output
```
[INFO] Running com.csa37.co1.ex05.MathUtilTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## Actual Execution Status
Verified and Executed via Maven Surefire test engine. All 5 assertions passed.

## Result
Thus the JUnit test cases to calculate the factorial of a number and validate the output using JUnit assertions were executed successfully and the output was verified.
