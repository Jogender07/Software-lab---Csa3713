# Experiment 47: Integration Testing for Library Management System

## 1. Aim
To write JUnit test cases to execute integration testing for a library management system.

## 2. Algorithm
1. Create the Maven project with junit-jupiter. Write the classes `Book`, `Member` (borrowing limit = 2) and `Library` that depend on each other.
2. Create the `Library` with real `Book` and `Member` objects in `@BeforeEach` so that the interfaces between the modules are tested together.
3. Write six integration tests: issue a book, issue it twice, exceed the limit, return a book, return a book not borrowed and unknown member.
4. Run the tests using `mvn test`, verify the output and stop.

## 3. Program & Test Suite
- [Book.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-47/Book.java)
- [Member.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-47/Member.java)
- [Library.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-47/Library.java)
- [LibraryIntegrationTest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO3-Testing-Levels/Experiment-47/LibraryIntegrationTest.java)

## 4. Execution Instructions
Run via Maven from project root:
```powershell
mvn test -Dtest=com.csa37.co3.ex47.LibraryIntegrationTest
```

## 5. Expected Output
```
[INFO] Running com.csa37.co3.ex47.LibraryIntegrationTest
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 6. Actual Execution Status
- Verified with Maven 3.9.6 on JDK 27.
- Status: **PASSED (6 / 6 tests passing)**.

## 7. Result
Thus the JUnit test cases to execute integration testing for a library management system were executed successfully and the output was verified.
