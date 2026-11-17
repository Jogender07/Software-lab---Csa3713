# Experiment 89: Detecting Flaky Behavior Using @RepeatedTest in JUnit 5

## 1. Aim
To write JUnit test cases to detect unstable behaviour using `@RepeatedTest` in JUnit.

## 2. Algorithm
1. Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. Write the class `IdGenerator` with the method `nextId()` that returns an increasing number, and the class `DiceUtil` with the method `roll()` that returns a random number from 1 to 6.
3. Write a test with `@RepeatedTest(5)` to verify that every generated id is greater than the previous id.
4. Write a second test with `@RepeatedTest(10)` to verify that the dice value is always between 1 and 6.
5. Run the tests using `mvn test`. A test that passes only in some repetitions is an unstable (flaky) test and must be investigated.
6. Stop.

## 3. Program & Test Suite
- [IdGenerator.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-89/IdGenerator.java)
- [DiceUtil.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-89/DiceUtil.java)
- [RepeatedBehaviourTest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-89/RepeatedBehaviourTest.java)

## 4. Execution Instructions
```powershell
mvn test -Dtest=com.csa37.co5.ex89.RepeatedBehaviourTest
```

## 5. Expected Output
```
[INFO] Running com.csa37.co5.ex89.RepeatedBehaviourTest
[INFO] Tests run: 15, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 6. Actual Execution Status
- Verified with Maven 3.9.6 on JDK 27.
- Status: **PASSED (15 / 15 repetitions passing)**.

## 7. Result
Thus the JUnit test cases to detect unstable behaviour using `@RepeatedTest` in JUnit were executed successfully and the output was verified.
