# Experiment 45: Unit Testing for Bank Account Management Application

## 1. Aim
To write JUnit test cases to implement unit testing for a bank account management application using JUnit.

## 2. Algorithm
1. Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. Write the class `BankAccount` with the methods `deposit()`, `withdraw()` and `getBalance()`, and validations for negative amounts and insufficient balance.
3. Write the test class `BankAccountTest` and create a new account with the balance 5000 before each test using `@BeforeEach`.
4. Write tests for deposit, withdrawal, insufficient balance, negative deposit and negative opening balance.
5. Run the tests using `mvn test` and verify that every unit of the account class works independently.
6. Stop.

## 3. Program & Test Suite
- Source: [BankAccount.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-45/BankAccount.java)
- Tests: [BankAccountTest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-45/BankAccountTest.java)

## 4. Execution Instructions
Run via Maven from project root:
```powershell
mvn test -Dtest=com.csa37.co3.ex45.BankAccountTest
```

## 5. Expected Output
```
[INFO] Running com.csa37.co3.ex45.BankAccountTest
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 6. Actual Execution Status
- Verified with Maven 3.9.6 on JDK 27.
- Status: **PASSED (6 / 6 tests passing)**.

## 7. Result
Thus the JUnit test cases to implement unit testing for a bank account management application using JUnit were executed successfully and the output was verified.
