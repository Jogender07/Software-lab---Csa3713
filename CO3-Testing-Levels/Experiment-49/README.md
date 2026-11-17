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

## 3. Program & Test Suite
- [IntStack.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-49/IntStack.java)
- [IntStackTest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-49/IntStackTest.java)

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
