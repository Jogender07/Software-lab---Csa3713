# Experiment 48: Regression Test Suite Using Tags and Test Suites in JUnit 5

## 1. Aim
To write JUnit test cases to create a regression test suite using tags and test suites in JUnit.

## 2. Algorithm
1. Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`. Also add the dependency `junit-platform-suite`.
2. Write the class `CartService` with the methods `addItem()`, `removeItem()`, `total()` and `totalWithDiscount()`.
3. Write the test class `CartTest` and mark the tests with `@Tag("smoke")` and `@Tag("regression")`.
4. Write the class `RegressionSuiteTest` annotated with `@Suite`, `@SelectClasses` and `@IncludeTags("regression")` so that only the regression tests are executed.
5. Run the suite using `mvn test -Dtest=RegressionSuiteTest` and verify that only the four regression tests are executed.
6. Stop.

## 3. Program & Test Suite
- [CartService.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-48/CartService.java)
- [CartTest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-48/CartTest.java)
- [RegressionSuiteTest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-48/RegressionSuiteTest.java)

## 4. Execution Instructions
Run via Maven from project root:
```powershell
mvn test -Dtest=com.csa37.co3.ex48.CartTest
```

## 5. Expected Output
```
[INFO] Running com.csa37.co3.ex48.CartTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 6. Actual Execution Status
- Verified with Maven 3.9.6 on JDK 27.
- Status: **PASSED (5 / 5 tests passing)**.

## 7. Result
Thus the JUnit test cases to create a regression test suite using tags and test suites in JUnit were executed successfully and the output was verified.
