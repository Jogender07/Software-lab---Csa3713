# Exercise 29: Execute Path Coverage Testing on a Payroll Calculation Program using JUnit (JUnit)

## Aim
To write JUnit test cases to execute path coverage testing on a payroll calculation program using JUnit.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. **Step 2:** Write the class `Payroll` with the method `netSalary(basic, overtimeHours)` containing three decisions: `overtime > 0`, `gross > 50000` and `gross > 25000`.
3. **Step 3:** Draw the control flow graph and calculate the cyclomatic complexity V(G) = number of decisions + 1 = 3 + 1 = 4.
4. **Step 4:** Identify the four independent paths: P1 (no overtime, no tax), P2 (overtime, no tax), P3 (10% tax) and P4 (20% tax).
5. **Step 5:** Write one JUnit test for each independent path using `assertEquals()` with a delta value.
6. **Step 6:** Run the tests using `mvn test` and verify that all four paths are executed.
7. **Step 7:** Stop.

## Program Code
- **Implementation:** `Payroll.java`
- **Test Class:** `PayrollPathTest.java`

## Execution Instructions
```bash
mvn test -Dtest=PayrollPathTest
```

## Expected Output
```
[INFO] Running com.csa37.co2.ex29.PayrollPathTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## Actual Execution Status
Verified with 4 independent path executions matching Cyclomatic Complexity V(G)=4.

## Result
Thus the JUnit test cases to execute path coverage testing on a payroll calculation program using JUnit were executed successfully and the output was verified.
