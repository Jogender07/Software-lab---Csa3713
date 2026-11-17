# Experiment 70: Test Execution Logging Using JUnit 5 TestWatcher Extension

## 1. Aim
To write JUnit test cases to generate a test execution log using the `TestWatcher` extension in JUnit.

## 2. Algorithm
1. Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. Write the class `WordCounter` with the method `count(String text)` that returns the number of words in a text.
3. Write the extension class `ResultLogger` that implements `TestWatcher` and overrides `testSuccessful()`, `testFailed()` and `testDisabled()` to write the date, time, status and test name into `test-log.txt`.
4. Write the test class `WordCounterTest` with `@ExtendWith(ResultLogger.class)`, three normal tests and one `@Disabled` test.
5. Run the tests using `mvn test` and open `test-log.txt` to verify the PASS and SKIP entries.
6. Stop.

## 3. Program & Test Suite
- [WordCounter.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-70/WordCounter.java)
- [ResultLogger.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-70/ResultLogger.java)
- [WordCounterTest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-70/WordCounterTest.java)

## 4. Execution Instructions
```powershell
mvn test -Dtest=com.csa37.co4.ex70.WordCounterTest
```

## 5. Expected Output
```
[INFO] Running com.csa37.co4.ex70.WordCounterTest
2026-10-30T10:15:01.120 | PASS | countsWords()
2026-10-30T10:15:01.131 | PASS | emptyStringHasZeroWords()
2026-10-30T10:15:01.135 | PASS | multipleSpacesAreIgnored()
2026-10-30T10:15:01.139 | SKIP | punctuationHandling()
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 1
[INFO] BUILD SUCCESS
```

## 6. Actual Execution Status
- Verified with Maven 3.9.6 on JDK 27.
- Status: **PASSED (3 passed, 1 skipped)**.

## 7. Result
Thus the JUnit test cases to generate a test execution log using the `TestWatcher` extension in JUnit were executed successfully and the output was verified.
