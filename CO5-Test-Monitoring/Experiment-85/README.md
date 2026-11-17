# Experiment 85: Code Coverage Measurement of Armstrong Number Program Using JaCoCo

## 1. Aim
To write JUnit test cases to measure the code coverage of an Armstrong number program using JaCoCo and JUnit.

## 2. Algorithm
1. Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`. Add the `jacoco-maven-plugin` (`prepare-agent` and `report` goals) to `pom.xml`.
2. Write the class `ArmstrongUtil` with the method `isArmstrong(int n)` that compares the sum of the digits raised to the power of the number of digits with `n`.
3. Write the test class `ArmstrongUtilTest` with Armstrong numbers, non-Armstrong numbers and a negative number.
4. Run `mvn clean test` to execute the tests and generate the coverage report.
5. Open `target/site/jacoco/index.html` and verify the line coverage and branch coverage of `ArmstrongUtil`.
6. Stop.

## 3. Program & Test Suite
- Source: [ArmstrongUtil.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-85/ArmstrongUtil.java)
- Tests: [ArmstrongUtilTest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-85/ArmstrongUtilTest.java)

## 4. Execution Instructions
```powershell
mvn test -Dtest=com.csa37.co5.ex85.ArmstrongUtilTest
```

## 5. Expected Output
```
[INFO] Running com.csa37.co5.ex85.ArmstrongUtilTest
[INFO] Tests run: 11, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
Line coverage   : 100 %
Branch coverage : 100 %
```

## 6. Actual Execution Status
- Verified with Maven 3.9.6 on JDK 27 with JaCoCo plugin.
- Status: **PASSED (11 / 11 tests passing; 100% coverage)**.

## 7. Result
Thus the JUnit test cases to measure the code coverage of an Armstrong number program using JaCoCo and JUnit were executed successfully and the output was verified.
