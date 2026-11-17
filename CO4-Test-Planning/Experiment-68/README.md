# Experiment 68: Test Data for Ticket Fare Calculation Using @MethodSource

## 1. Aim
To write JUnit test cases to create test data for a ticket fare calculation using `@MethodSource` in JUnit.

## 2. Algorithm
1. Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. Write the class `TicketFare` with the method `fare(age, travelClass)`: base fare SL = 300 and AC = 800; free below 5 years, 50% for age 5 to 12, 40% discount for age 60 and above.
3. Design the test data using boundary values of age (4, 5, 12, 13, 59, 60) and both travel classes.
4. Write the method `fareData()` that returns a `Stream<Arguments>` and use it with `@ParameterizedTest` and `@MethodSource`.
5. Write one more test with an invalid travel class and expect `IllegalArgumentException`.
6. Run the tests using `mvn test` and verify the output.
7. Stop.

## 3. Program & Test Suite
- [TicketFare.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-68/TicketFare.java)
- [TicketFareTest.java](file:///c:/smilewell/CSA37-Software-Testing-Lab/CO4-Test-Planning/Experiment-68/TicketFareTest.java)

## 4. Execution Instructions
```powershell
mvn test -Dtest=com.csa37.co4.ex68.TicketFareTest
```

## 5. Expected Output
```
[INFO] Running com.csa37.co4.ex68.TicketFareTest
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 6. Actual Execution Status
- Verified with Maven 3.9.6 on JDK 27.
- Status: **PASSED (7 / 7 tests passing)**.

## 7. Result
Thus the JUnit test cases to create test data for a ticket fare calculation using `@MethodSource` in JUnit were executed successfully and the output was verified.
