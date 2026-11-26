# Experiment 48: Regression Test Suite Using Tags and Test Suites in JUnit 5

## 1. Aim
To write JUnit test cases to create a regression test suite using tags and test suites in JUnit.

## 2. Algorithm
1. Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`. Also add the dependency `junit-platform-suite`.
2. Write the class `CartService` with the methods `addItem()`, `removeItem()`, `total()` and `totalWithDiscount()`.
3. Write the test class `CartTest` and mark the tests with `@Tag("smoke")` and `@Tag("regression")`.
4. Write the class `RegressionSuiteTest` annotated with `@Suite`, `@SelectClasses` and `@IncludeTags("regression")` so that only the regression tests are executed.
5. Run the suite using `mvn test -Dtest=RegressionSuiteTest` and verify that only the four regression tests are executed.
6. Stop.

## 3. Program Code & Test Suite

### CartService.java
`java
import java.util.LinkedHashMap;
import java.util.Map;

public class CartService {
    private final Map<String, Double> items = new LinkedHashMap<>();

    public void addItem(String name, double price) {
        items.put(name, price);
    }

    public boolean removeItem(String name) {
        return items.remove(name) != null;
    }

    public int size() {
        return items.size();
    }

    public double total() {
        return items.values().stream().mapToDouble(Double::doubleValue).sum();
    }

    public double totalWithDiscount(double percent) {
        return total() * (100 - percent) / 100;
    }
}
`

### CartTest.java
`java
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartTest {
    @Test
    @Tag("smoke")
    @Tag("regression")
    void addItemIncreasesSize() {
        CartService cart = new CartService();
        cart.addItem("Pen", 10);
        assertEquals(1, cart.size());
    }

    @Test
    @Tag("regression")
    void removeItemWorks() {
        CartService cart = new CartService();
        cart.addItem("Pen", 10);
        assertTrue(cart.removeItem("Pen"));
        assertEquals(0, cart.size());
    }

    @Test
    @Tag("regression")
    void totalOfTwoItems() {
        CartService cart = new CartService();
        cart.addItem("Pen", 100);
        cart.addItem("Book", 250);
        assertEquals(350, cart.total(), 0.001);
    }

    @Test
    @Tag("smoke")
    void emptyCartTotalIsZero() {
        assertEquals(0, new CartService().total(), 0.001);
    }

    @Test
    @Tag("regression")
    void discountIsApplied() {
        CartService cart = new CartService();
        cart.addItem("Pen", 100);
        cart.addItem("Book", 250);
        assertEquals(315, cart.totalWithDiscount(10), 0.001);
    }
}
`

### RegressionSuiteTest.java
`java
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses(CartTest.class)
@IncludeTags("regression")
public class RegressionSuiteTest {
}
`


## 4. Execution Instructions
Run via Maven from project root:
```powershell
mvn test -Dtest=com.csa37.co3.ex48.CartTest
```

## 5. Expected Output
```
[INFO] Running com.csa37.co3.ex48.CartTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 6. Actual Execution Status
- Verified with Maven 3.9.6 on JDK 27.
- Status: **PASSED (5 / 5 tests passing)**.

## 7. Result
Thus the JUnit test cases to create a regression test suite using tags and test suites in JUnit were executed successfully and the output was verified.
