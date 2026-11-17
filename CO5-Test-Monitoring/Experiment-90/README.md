# Experiment 90: Confirmation and Regression Testing After Defect Fix

## 1. Aim
To write JUnit test cases to perform confirmation and regression testing after a defect fix in an average calculation program.

## 2. Algorithm
1. Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. Study the defect report DEF-07: average of `{1, 2}` returned `1` instead of `1.5` because the sum was divided using integer division.
3. Write the corrected class `Stats` with the method `average(int[] values)` that casts the sum to double before the division and throws an exception for an empty array.
4. Write the confirmation test (re-test of the failed case) and tag it with `@Tag("confirmation")`.
5. Write the regression tests for the remaining behaviour: three numbers, a single number, negative numbers and an empty array, and tag them with `@Tag("regression")`.
6. Run the tests using `mvn test` and verify that the defect is fixed and that no other behaviour is broken.
7. Stop.

## 3. Program & Test Suite
- [Stats.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-90/Stats.java)
- [StatsTest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-90/StatsTest.java)

## 4. Execution Instructions
```powershell
mvn test -Dtest=com.csa37.co5.ex90.StatsTest
```

## 5. Expected Output
```
[INFO] Running com.csa37.co5.ex90.StatsTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 6. Actual Execution Status
- Verified with Maven 3.9.6 on JDK 27.
- Status: **PASSED (5 / 5 tests passing)**.

## 7. Result
Thus the JUnit test cases to perform confirmation and regression testing after a defect fix in an average calculation program were executed successfully and the output was verified.
