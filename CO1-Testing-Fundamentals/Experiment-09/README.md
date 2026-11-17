# Exercise 9: Test Exception Handling of a Division Program using assertThrows in JUnit (JUnit)

## Aim
To write JUnit test cases to test the exception handling of a division program using `assertThrows`.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. **Step 2:** Write the class `Calculator` with the method `divide(int a, int b)` that throws `ArithmeticException` with the message "Cannot divide by zero" when b is 0.
3. **Step 3:** Write the test class `CalculatorTest` and verify a valid division using `assertEquals()`.
4. **Step 4:** Use `assertThrows()` to capture the exception for division by zero and compare its message using `assertEquals()`.
5. **Step 5:** Run the tests using `mvn test` and verify the output.
6. **Step 6:** Stop.

## Program Code
- **Implementation:** `Calculator.java`
- **Test Class:** `CalculatorTest.java`

## Execution Instructions
```bash
# From repository root
mvn test -Dtest=com.csa37.co1.ex09.CalculatorTest
```

## Expected Output
```
[INFO] Running com.csa37.co1.ex09.CalculatorTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## Actual Execution Status
Verified and Executed via Maven Surefire test engine. Both test methods passed.

## Result
Thus the JUnit test cases to test the exception handling of a division program using assertThrows were executed successfully and the output was verified.
