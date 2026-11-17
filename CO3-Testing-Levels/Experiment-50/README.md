# Experiment 50: Parameterized Testing for Compound Interest Calculation

## 1. Aim
To write JUnit test cases to calculate compound interest and validate the output using JUnit parameterized tests.

## 2. Algorithm
1. Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. Write the class `CompoundInterest` with the method `interest(principal, rate, years) = P x (1 + R/100)^N - P` and an exception for a negative principal.
3. Write the test class `CompoundInterestTest` with a `@ParameterizedTest` and `@CsvSource` containing the principal, rate, years and expected interest.
4. Use `assertEquals()` with a delta of 0.01 to compare the double values.
5. Write one more test that expects `IllegalArgumentException` for a negative principal.
6. Run the tests using `mvn test` and verify the output.
7. Stop.

## 3. Program & Test Suite
- [CompoundInterest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-50/CompoundInterest.java)
- [CompoundInterestTest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-50/CompoundInterestTest.java)

## 4. Execution Instructions
Run via Maven from project root:
```powershell
mvn test -Dtest=com.csa37.co3.ex50.CompoundInterestTest
```

## 5. Expected Output
```
[INFO] Running com.csa37.co3.ex50.CompoundInterestTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 6. Actual Execution Status
- Verified with Maven 3.9.6 on JDK 27.
- Status: **PASSED (5 / 5 tests passing)**.

## 7. Result
Thus the JUnit test cases to calculate compound interest and validate the output using JUnit parameterized tests were executed successfully and the output was verified.
