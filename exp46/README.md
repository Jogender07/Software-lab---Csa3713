# Experiment 46: Test Harness Using Stub and Driver for Fare Calculation Module

## 1. Aim
To write JUnit test cases to design a test harness using a stub and a driver to unit test a fare calculation module.

## 2. Algorithm
1. Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. Write the interface `DistanceService` that returns the distance in km between two stops. The real implementation is not ready, so it will be replaced by a stub.
3. Write the class `FareCalculator` (unit under test) that calculates `fare = 50 + 12 x km` using the `DistanceService`.
4. Write the test class `FareCalculatorTest` as the driver. Create stubs using lambda expressions that return fixed distances 10, 0 and -5.
5. Verify the fare for each stub using `assertEquals()` and `assertThrows()`.
6. Run the tests using `mvn test` and verify the output.
7. Stop.

## 3. Program Code & Test Suite

### DistanceService.java
`java
public interface DistanceService {
    int getDistanceKm(String from, String to);
}
`

### FareCalculator.java
`java
public class FareCalculator {
    private static final int BASE_FARE = 50;
    private static final int RATE_PER_KM = 12;
    private final DistanceService distanceService;

    public FareCalculator(DistanceService distanceService) {
        this.distanceService = distanceService;
    }

    public int fare(String from, String to) {
        int km = distanceService.getDistanceKm(from, to);
        if (km < 0) {
            throw new IllegalStateException("Invalid distance");
        }
        return BASE_FARE + km * RATE_PER_KM;
    }
}
`

### FareCalculatorTest.java
`java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FareCalculatorTest {
    @Test
    void fareForTenKm() {
        DistanceService stub = (from, to) -> 10; // stub
        FareCalculator calculator = new FareCalculator(stub);
        assertEquals(170, calculator.fare("Chennai", "Tambaram"));
    }

    @Test
    void fareForZeroKm() {
        FareCalculator calculator = new FareCalculator((from, to) -> 0);
        assertEquals(50, calculator.fare("Guindy", "Guindy"));
    }

    @Test
    void invalidDistanceThrows() {
        FareCalculator calculator = new FareCalculator((from, to) -> -5);
        assertThrows(IllegalStateException.class, () -> calculator.fare("A", "B"));
    }
}
`


## 4. Execution Instructions
Run via Maven from project root:
```powershell
mvn test -Dtest=com.csa37.co3.ex46.FareCalculatorTest
```

## 5. Expected Output
```
[INFO] Running com.csa37.co3.ex46.FareCalculatorTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 6. Actual Execution Status
- Verified with Maven 3.9.6 on JDK 27.
- Status: **PASSED (3 / 3 tests passing)**.

## 7. Result
Thus the JUnit test cases to design a test harness using a stub and a driver to unit test a fare calculation module were executed successfully and the output was verified.
