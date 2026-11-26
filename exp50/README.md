# Experiment 50: Parameterized Testing for Compound Interest Calculation

## 1. Aim
To write JUnit test cases to calculate compound interest and validate the output using JUnit parameterized tests.

## 2. Algorithm
1. Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. Write the class `CompoundInterest` with the method `interest(principal, rate, years) = P x (1 + R/100)^N - P` and an exception for a negative principal.
3. Write the test class `CompoundInterestTest` with a `@ParameterizedTest` and `@CsvSource` containing the principal, rate, years and expected interest.
4. Use `assertEquals()` with a delta of 0.01 to compare the double values.
5. Write one more test that expects `IllegalArgumentException` for a negative principal.
6. Run the tests using `mvn test` and verify the output.
7. Stop.

## 3. Program Code & Test Suite

### CompoundInterest.java
`java
public class CompoundInterest {
    public static double interest(double principal, double rate, int years) {
        if (principal < 0) {
            throw new IllegalArgumentException("Principal cannot be negative");
        }
        return principal * Math.pow(1 + rate / 100, years) - principal;
    }
}
`

### CompoundInterestTest.java
`java
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class CompoundInterestTest {
    @ParameterizedTest(name = "P={0}, R={1}%, N={2} -> CI={3}")
    @CsvSource({
        "1000,10,1,100.00",
        "1000,10,2,210.00",
        "5000,8,3,1298.56",
        "2000,5,0,0.00"
    })
    void computesInterest(double p, double r, int n, double expected) {
        assertEquals(expected, CompoundInterest.interest(p, r, n), 0.01);
    }

    @Test
    void negativePrincipalThrows() {
        assertThrows(IllegalArgumentException.class,
                () -> CompoundInterest.interest(-1000, 10, 2));
    }
}
`


## 4. Execution Instructions
Run via Maven from project root:
```powershell
mvn test -Dtest=com.csa37.co3.ex50.CompoundInterestTest
```

## 5. Expected Output
```
[INFO] Running com.csa37.co3.ex50.CompoundInterestTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 6. Actual Execution Status
- Verified with Maven 3.9.6 on JDK 27.
- Status: **PASSED (5 / 5 tests passing)**.

## 7. Result
Thus the JUnit test cases to calculate compound interest and validate the output using JUnit parameterized tests were executed successfully and the output was verified.
