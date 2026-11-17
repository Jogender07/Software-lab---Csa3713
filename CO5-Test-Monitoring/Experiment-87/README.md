# Experiment 87: Controlling Test Execution with @Disabled and Assumptions

## 1. Aim
To write JUnit test cases to control test execution using `@Disabled`, conditional annotations and assumptions in JUnit.

## 2. Algorithm
1. Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. Write the class `LoginValidator` with the method `isValid(username, password)`: username not empty and password at least 6 characters.
3. Write test 1: valid login that runs in every environment.
4. Write test 2: with `@EnabledIfSystemProperty(named = "env", matches = "qa")` to run only in the QA environment.
5. Write test 3: with `@Disabled("Feature under development")` for an unfinished feature.
6. Write test 4: that uses `assumeTrue()` to run the check only when `env=qa` is set.
7. Run the tests using `mvn test -Denv=qa` and verify that the tests are executed, disabled or skipped as configured.
8. Stop.

## 3. Program & Test Suite
- [LoginValidator.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-87/LoginValidator.java)
- [LoginValidatorTest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO5-Test-Monitoring/Experiment-87/LoginValidatorTest.java)

## 4. Execution Instructions
```powershell
mvn test -Dtest=com.csa37.co5.ex87.LoginValidatorTest -Denv=qa
```

## 5. Expected Output
```
[INFO] Running com.csa37.co5.ex87.LoginValidatorTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 1
[INFO] BUILD SUCCESS
```

## 6. Actual Execution Status
- Conditional execution, assumptions, and disabled annotations verified.
- Status: **PASSED (3 passed, 1 skipped)**.

## 7. Result
Thus the JUnit test cases to control test execution using `@Disabled`, conditional annotations and assumptions in JUnit were executed successfully and the output was verified.
