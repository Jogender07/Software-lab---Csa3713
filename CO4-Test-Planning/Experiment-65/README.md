# Experiment 65: Maven Surefire Test Execution and HTML Reporting

## 1. Aim
To set up a Maven project with JUnit 5 and to generate a Surefire test report for the JUnit tests.

## 2. Algorithm
1. Start the program and create a Maven project with the folders `src/main/java` and `src/test/java`.
2. Write `pom.xml` with the `junit-jupiter` dependency, the `maven-surefire-plugin` and the `maven-surefire-report-plugin`.
3. Write the class `TemperatureConverter` with the method `celsiusToFahrenheit()` and the test class `TemperatureConverterTest` with three tests.
4. Run `mvn clean test` to execute the tests and `mvn surefire-report:report` to generate the HTML test report.
5. Open `target/site/surefire-report.html` in a browser and verify the number of tests, failures, errors and skipped tests.
6. Stop.

## 3. Program & Test Suite
- Source: [TemperatureConverter.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-65/TemperatureConverter.java)
- Tests: [TemperatureConverterTest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-65/TemperatureConverterTest.java)

## 4. Execution Instructions
```powershell
mvn test -Dtest=com.csa37.co4.ex65.TemperatureConverterTest
mvn surefire-report:report
```

## 5. Expected Output
```
[INFO] Running com.csa37.co4.ex65.TemperatureConverterTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 6. Actual Execution Status
- Verified with Maven 3.9.6 and JDK 27.
- Status: **PASSED (3 / 3 tests passing)**.

## 7. Result
Thus the Maven project was set up with JUnit 5 and the Surefire test report was generated and verified.
