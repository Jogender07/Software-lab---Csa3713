# Experiment 88: Programmatic Test Execution Using JUnit Launcher

## 1. Aim
To write JUnit test cases to monitor test execution programmatically using the JUnit Launcher and `SummaryGeneratingListener`.

## 2. Algorithm
1. Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`. Also add the dependency `junit-platform-launcher`.
2. Write the class `Discount` with the method `discount(amount)` that gives 10% discount above 1000. The condition is written as `amount > 1000` to seed a defect (it should be `amount >= 1000`).
3. Write the test class `DiscountTest` with four tests that include a boundary test at 1000.
4. Write the class `TestRunner` that builds a `LauncherDiscoveryRequest`, executes it using the `Launcher` and collects the results using `SummaryGeneratingListener`.
5. Print the number of tests found, succeeded and failed, the pass percentage and the names of the failed tests, and analyse the defect detected.
6. Stop.

## 3. Program & Test Suite
- Unit: [Discount.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-88/Discount.java)
- Tests: [DiscountTest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-88/DiscountTest.java)
- Runner: [TestRunner.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-88/TestRunner.java)

## 4. Execution Instructions
Run programmatic runner:
```powershell
mvn test-compile
java -cp "target/classes;target/test-classes;target/dependency/*" com.csa37.co5.ex88.TestRunner
```

## 5. Expected Output
```
Tests found      : 4
Tests succeeded  : 3
Tests failed     : 1
Pass percentage  : 75.00%
FAILED TEST      : discountAtLimit()
```

## 6. Actual Execution Status
- Programmatic Launcher discovery and summary generation verified.
- Status: **VERIFIED**.

## 7. Result
Thus the JUnit test cases to monitor test execution programmatically using the JUnit Launcher and `SummaryGeneratingListener` were executed successfully and the output was verified.
