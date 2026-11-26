# Exercise 25: Implement Equivalence Class Partitioning Tests for a Calculator using JUnit (JUnit)

## Aim
To write JUnit test cases to implement equivalence class partitioning tests for a calculator using JUnit.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. **Step 2:** Write the class `Calculator` with the methods `add()`, `subtract()`, `multiply()` and `divide()`.
3. **Step 3:** Identify the equivalence classes of the inputs for `add()`: positive and positive, negative and negative, positive and negative, and zero and zero.
4. **Step 4:** Write a `@ParameterizedTest` with `@CsvSource` that executes one representative value from each valid class.
5. **Step 5:** Write one test for a valid class of `divide()` and one test for the invalid class (divisor = 0) using `assertThrows()`.
6. **Step 6:** Run the tests using `mvn test` and verify the output.
7. **Step 7:** Stop.

## Program Code

### Calculator.java
`java
public class Calculator {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
`

### CalculatorEPTest.java
`java
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorEPTest {
    private final Calculator calc = new Calculator();

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({"5,3,8", "-5,-3,-8", "5,-3,2", "0,0,0"})
    void addEquivalenceClasses(int a, int b, int expected) {
        assertEquals(expected, calc.add(a, b));
    }

    @Test
    void divideValidClass() {
        assertEquals(4, calc.divide(20, 5));
    }

    @Test
    void divideInvalidClassZeroDivisor() {
        assertThrows(ArithmeticException.class, () -> calc.divide(20, 0));
    }
}
`


## Execution Instructions
```bash
mvn test -Dtest=CalculatorEPTest
```

## Expected Output
```
[INFO] Running com.csa37.co2.ex25.CalculatorEPTest
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## Actual Execution Status
Implemented and verified using JUnit 5 Parameterized tests with `@CsvSource`.

## Result
Thus the JUnit test cases to implement equivalence class partitioning tests for a calculator using JUnit were executed successfully and the output was verified.
