# Experiment 69: Hierarchical Test Organization Using @Nested in JUnit 5

## 1. Aim
To write JUnit test cases to organise the tests of a shopping cart module using `@Nested` test classes in JUnit.

## 2. Algorithm
1. Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. Write the class `ShoppingCart` with the methods `add()`, `remove()`, `itemCount()` and `total()`.
3. Write the test class `ShoppingCartTest` and divide the tests into three groups using `@Nested` classes: AddingItems, RemovingItems and Totals.
4. Give every group a readable name using `@DisplayName` so that the test plan structure is visible in the report.
5. Run the tests using `mvn test` and verify that the tests of every group are executed.
6. Stop.

## 3. Program & Test Suite
- [ShoppingCart.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-69/ShoppingCart.java)
- [ShoppingCartTest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-69/ShoppingCartTest.java)

## 4. Execution Instructions
```powershell
mvn test -Dtest=com.csa37.co4.ex69.ShoppingCartTest
```

## 5. Expected Output
```
[INFO] Running ShoppingCartTest$AddingItems   -> Tests run: 2, Failures: 0, Errors: 0
[INFO] Running ShoppingCartTest$RemovingItems -> Tests run: 1, Failures: 0, Errors: 0
[INFO] Running ShoppingCartTest$Totals        -> Tests run: 2, Failures: 0, Errors: 0
[INFO] Results: Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 6. Actual Execution Status
- Verified with Maven 3.9.6 on JDK 27.
- Status: **PASSED (5 / 5 tests passing)**.

## 7. Result
Thus the JUnit test cases to organise the tests of a shopping cart module using `@Nested` test classes in JUnit were executed successfully and the output was verified.
