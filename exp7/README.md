# Exercise 7: Check Whether a Number is Prime and Validate using JUnit Assertions (JUnit)

## Aim
To write JUnit test cases to check whether a number is prime and validate the output using JUnit assertions.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. **Step 2:** Write the class `PrimeUtil` with the method `isPrime(int n)` that returns false for n < 2 and checks divisibility from 2 up to the square root of n.
3. **Step 3:** Write the test class `PrimeUtilTest` with tests for prime numbers, composite numbers and numbers less than 2.
4. **Step 4:** Use `assertTrue()` for the prime numbers and `assertFalse()` for all the other numbers.
5. **Step 5:** Run the tests using `mvn test` and verify the output.
6. **Step 6:** Stop.

## Program Code

### PrimeUtil.java
`java
public class PrimeUtil {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
`

### PrimeUtilTest.java
`java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeUtilTest {
    @Test
    void primeNumbers() {
        assertTrue(PrimeUtil.isPrime(2));
        assertTrue(PrimeUtil.isPrime(3));
        assertTrue(PrimeUtil.isPrime(17));
    }
    @Test
    void compositeNumbers() {
        assertFalse(PrimeUtil.isPrime(4));
        assertFalse(PrimeUtil.isPrime(25));
        assertFalse(PrimeUtil.isPrime(100));
    }
    @Test
    void numbersLessThanTwo() {
        assertFalse(PrimeUtil.isPrime(1));
        assertFalse(PrimeUtil.isPrime(0));
        assertFalse(PrimeUtil.isPrime(-7));
    }
}
`


## Execution Instructions
```bash
# From repository root
mvn test -Dtest=PrimeUtilTest
```

## Expected Output
```
[INFO] Running com.csa37.co1.ex07.PrimeUtilTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## Actual Execution Status
Verified and Executed via Maven Surefire test engine. All 3 test groups passed.

## Result
Thus the JUnit test cases to check whether a number is prime and validate the output using JUnit assertions were executed successfully and the output was verified.
