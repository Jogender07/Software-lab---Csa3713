# Experiment 86: Performance Monitoring with assertTimeout and @Timeout in JUnit 5

## 1. Aim
To write JUnit test cases to monitor the execution time of a sorting program using `assertTimeout` and `@Timeout` in JUnit.

## 2. Algorithm
1. Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. Write the class `PerfUtil` with the methods `sort(int[] a)` and `linearSearch(int[] a, int key)`.
3. Generate 100000 random numbers using a fixed seed so that the test data is the same in every run.
4. Use `assertTimeout()` to verify that the sort completes within 500 milliseconds, and `@Timeout` to verify that search completes within one second.
5. Verify the correctness of the sorted array in a separate test.
6. Run the tests using `mvn test` and verify the output.
7. Stop.

## 3. Program & Test Suite
- [PerfUtil.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-86/PerfUtil.java)
- [PerfUtilTest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-86/PerfUtilTest.java)

## 4. Execution Instructions
```powershell
mvn test -Dtest=com.csa37.co5.ex86.PerfUtilTest
```

## 5. Expected Output
```
[INFO] Running com.csa37.co5.ex86.PerfUtilTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 6. Actual Execution Status
- Execution SLA timers verified with JUnit 5 timeouts.
- Status: **PASSED (2 / 2 tests passing)**.

## 7. Result
Thus the JUnit test cases to monitor the execution time of a sorting program using `assertTimeout` and `@Timeout` in JUnit were executed successfully and the output was verified.
