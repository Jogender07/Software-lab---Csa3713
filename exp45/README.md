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

## 3. Program Code & Test Suite

### BankAccount.java
`java
public class BankAccount {
    private final String accountNo;
    private double balance;

    public BankAccount(String accountNo, double openingBalance) {
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative");
        }
        this.accountNo = accountNo;
        this.balance = openingBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal must be positive");
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient balance");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNo() {
        return accountNo;
    }
}
`

### BankAccountTest.java
`java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount("ACC1001", 5000);
    }

    @Test
    void initialBalanceIsStored() {
        assertEquals(5000, account.getBalance(), 0.001);
    }

    @Test
    void depositIncreasesBalance() {
        account.deposit(1000);
        assertEquals(6000, account.getBalance(), 0.001);
    }

    @Test
    void withdrawDecreasesBalance() {
        account.withdraw(2000);
        assertEquals(3000, account.getBalance(), 0.001);
    }

    @Test
    void withdrawMoreThanBalanceThrows() {
        assertThrows(IllegalStateException.class, () -> account.withdraw(6000));
    }

    @Test
    void negativeDepositThrows() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-100));
    }

    @Test
    void negativeOpeningBalanceThrows() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccount("ACC1002", -1));
    }
}
`


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
