# Experiment 66: Test Documentation Using @DisplayName and @Tag in JUnit 5

## 1. Aim
To write JUnit test cases to document test cases using `@DisplayName` and `@Tag` for simple interest calculation based on customer type.

## 2. Algorithm
1. Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. Write the class `InterestCalculator` with the method `simpleInterest(customerType, principal, years)` using the rates REGULAR = 6%, SENIOR = 7.5% and STAFF = 8%.
3. Prepare the test case table: TC01 regular customer, TC02 senior customer, TC03 staff customer and TC04 unknown customer type.
4. Write one test for every test case and record the test case id and description using `@DisplayName` and `@Tag`.
5. Run the tests using `mvn test` and verify that the test case ids appear in the test report.
6. Stop.

## 3. Program & Test Suite
- [InterestCalculator.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-66/InterestCalculator.java)
- [InterestCalculatorTest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-66/InterestCalculatorTest.java)

## 4. Execution Instructions
```powershell
mvn test -Dtest=com.csa37.co4.ex66.InterestCalculatorTest
```

## 5. Expected Output
```
[INFO] Running com.csa37.co4.ex66.InterestCalculatorTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 6. Actual Execution Status
- Verified with Maven 3.9.6 on JDK 27.
- Status: **PASSED (4 / 4 tests passing)**.

## 7. Result
Thus the JUnit test cases to document test cases using `@DisplayName` and `@Tag` for simple interest calculation were executed successfully and the output was verified.
