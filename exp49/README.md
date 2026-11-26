# Experiment 49: JUnit Test Life Cycle Using a Stack Implementation

## 1. Aim
To write JUnit test cases to demonstrate the JUnit test life cycle using a stack implementation.

## 2. Algorithm
1. Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. Write the class `IntStack` with the methods `push()`, `pop()`, `peek()`, `isEmpty()` and `size()`.
3. Write the test class `IntStackTest` and use `@BeforeAll`, `@BeforeEach`, `@AfterEach` and `@AfterAll` with print statements to show the order of execution.
4. Use `@TestMethodOrder` and `@Order` to fix the order of the four tests: push, pop, peek and pop on an empty stack.
5. Run the tests using `mvn test` and observe the order in which the life cycle methods are called.
6. Stop.

## 3. Program Code & Test Suite

### IntStack.java
`java
import java.util.ArrayList;
import java.util.List;

public class IntStack {
    private final List<Integer> data = new ArrayList<>();

    public void push(int x) {
        data.add(x);
    }

    public int pop() {
        if (data.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data.remove(data.size() - 1);
    }

    public int peek() {
        if (data.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data.get(data.size() - 1);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int size() {
        return data.size();
    }
}
`

### IntStackTest.java
`java
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class IntStackTest {
    private IntStack stack;

    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll  : test class initialised");
    }

    @BeforeEach
    void setUp() {
        stack = new IntStack();
        System.out.println("  @BeforeEach : new stack created");
    }

    @AfterEach
    void tearDown() {
        System.out.println("  @AfterEach  : stack discarded");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll   : all tests completed");
    }

    @Test
    @Order(1)
    void pushIncreasesSize() {
        stack.push(10);
        assertEquals(1, stack.size());
    }

    @Test
    @Order(2)
    void popReturnsLastPushedElement() {
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.pop());
    }

    @Test
    @Order(3)
    void peekDoesNotRemoveElement() {
        stack.push(5);
        assertEquals(5, stack.peek());
        assertEquals(1, stack.size());
    }

    @Test
    @Order(4)
    void popOnEmptyStackThrows() {
        assertThrows(IllegalStateException.class, () -> stack.pop());
    }
}
`


## 4. Execution Instructions
Run via Maven from project root:
```powershell
mvn test -Dtest=com.csa37.co3.ex49.IntStackTest
```

## 5. Expected Output
```
@BeforeAll  : test class initialised
  @BeforeEach : new stack created
  @AfterEach  : stack discarded
  @BeforeEach : new stack created
  @AfterEach  : stack discarded
  @BeforeEach : new stack created
  @AfterEach  : stack discarded
  @BeforeEach : new stack created
  @AfterEach  : stack discarded
@AfterAll   : all tests completed
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0  BUILD SUCCESS
```

## 6. Actual Execution Status
- Verified with Maven 3.9.6 on JDK 27.
- Status: **PASSED (4 / 4 tests passing)**.

## 7. Result
Thus the JUnit test cases to demonstrate the JUnit test life cycle using a stack implementation were executed successfully and the output was verified.
