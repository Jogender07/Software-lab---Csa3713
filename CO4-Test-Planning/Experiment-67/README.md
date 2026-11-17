# Experiment 67: Test Data Table for Anagram Checker Using Parameterized Tests

## 1. Aim
To write JUnit test cases to create a test data table for an anagram checker using JUnit parameterized tests.

## 2. Algorithm
1. Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. Write the class `AnagramChecker` with the method `isAnagram(a, b)` that removes spaces, converts to lower case and checks whether two words have the same characters.
3. Design a test data table with positive cases (valid anagrams with different cases and spaces) and negative cases.
4. Write the test class `AnagramCheckerTest` with `@ParameterizedTest` and `@CsvSource` to execute the test table.
5. Write one more test to verify that `null` input returns `false`.
6. Run the tests using `mvn test` and verify the output.
7. Stop.

## 3. Program & Test Suite
- [AnagramChecker.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-67/AnagramChecker.java)
- [AnagramCheckerTest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-67/AnagramCheckerTest.java)

## 4. Execution Instructions
```powershell
mvn test -Dtest=com.csa37.co4.ex67.AnagramCheckerTest
```

## 5. Expected Output
```
[INFO] Running com.csa37.co4.ex67.AnagramCheckerTest
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 6. Actual Execution Status
- Verified with Maven 3.9.6 on JDK 27.
- Status: **PASSED (6 / 6 tests passing)**.

## 7. Result
Thus the JUnit test cases to create a test data table for an anagram checker using JUnit parameterized tests were executed successfully and the output was verified.
