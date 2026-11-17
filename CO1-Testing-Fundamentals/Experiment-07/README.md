# Exercise 7: Check Whether a Number is Prime and Validate using JUnit Assertions (JUnit)

## Aim
To write JUnit test cases to check whether a number is prime and validate the output using JUnit assertions.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. **Step 2:** Write the class `PrimeUtil` with the method `isPrime(int n)` that returns false for n < 2 and checks divisibility from 2 up to the square root of n.
3. **Step 3:** Write the test class `PrimeUtilTest` with tests for prime numbers, composite numbers and numbers less than 2.
4. **Step 4:** Use `assertTrue()` for the prime numbers and `assertFalse()` for all the other numbers.
5. **Step 5:** Run the tests using `mvn test` and verify the output.
6. **Step 6:** Stop.

## Program Code
- **Implementation:** `PrimeUtil.java`
- **Test Class:** `PrimeUtilTest.java`

## Execution Instructions
```bash
# From repository root
mvn test -Dtest=PrimeUtilTest
```

## Expected Output
```
[INFO] Running com.csa37.co1.ex07.PrimeUtilTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## Actual Execution Status
Verified and Executed via Maven Surefire test engine. All 3 test groups passed.

## Result
Thus the JUnit test cases to check whether a number is prime and validate the output using JUnit assertions were executed successfully and the output was verified.
