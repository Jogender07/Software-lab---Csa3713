# Exercise 30: Achieve Branch Coverage on a Program that Finds the Largest of Three Numbers using JUnit (JUnit)

## Aim
To write JUnit test cases to achieve branch coverage on a program that finds the largest of three numbers using JUnit.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. **Step 2:** Write the class `MaxFinder` with the method `largest(a, b, c)` containing the decisions `a >= b`, `a >= c` and `b >= c`.
3. **Step 3:** List the branches: each decision must be executed once as true and once as false.
4. **Step 4:** Write four tests so that every return statement is executed: a is largest, c is largest when a >= b, b is largest and c is largest when b > a.
5. **Step 5:** Add one more test with three equal numbers.
6. **Step 6:** Run the tests using `mvn test` and verify that all the branches are covered.
7. **Step 7:** Stop.

## Program Code

### MaxFinder.java
`java
public class MaxFinder {
    public static int largest(int a, int b, int c) {
        if (a >= b) {
            if (a >= c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b >= c) {
                return b;
            } else {
                return c;
            }
        }
    }
}
`

### MaxFinderTest.java
`java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxFinderTest {
    @Test
    void aIsLargest() { assertEquals(9, MaxFinder.largest(9, 5, 3)); }
    @Test
    void cIsLargestWhenAGreaterThanB() { assertEquals(9, MaxFinder.largest(5, 3, 9)); }
    @Test
    void bIsLargest() { assertEquals(9, MaxFinder.largest(3, 9, 5)); }
    @Test
    void cIsLargestWhenBGreaterThanA() { assertEquals(9, MaxFinder.largest(3, 5, 9)); }
    @Test
    void allNumbersEqual() { assertEquals(4, MaxFinder.largest(4, 4, 4)); }
}
`


## Execution Instructions
```bash
mvn test -Dtest=MaxFinderTest
```

## Expected Output
```
[INFO] Running com.csa37.co2.ex30.MaxFinderTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## Actual Execution Status
Verified with 5 test methods covering 100% of all decision branches.

## Result
Thus the JUnit test cases to achieve branch coverage on a program that finds the largest of three numbers using JUnit were executed successfully and the output was verified.
