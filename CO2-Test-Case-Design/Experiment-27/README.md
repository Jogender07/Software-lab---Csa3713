# Exercise 27: Validate Voting Eligibility Based on Age using Boundary Value Analysis in JUnit (JUnit)

## Aim
To write JUnit test cases to validate voting eligibility based on age using boundary value analysis in JUnit.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. **Step 2:** Write the class `VoteChecker` with the method `isEligible(int age)` that returns true for age 18 or more and throws `IllegalArgumentException` for age below 0 or above 120.
3. **Step 3:** Identify the boundary values: -1, 0, 17, 18, 19, 120 and 121.
4. **Step 4:** Write a `@ParameterizedTest` with `@CsvSource` for the valid boundary values and verify the result using `assertEquals()`.
5. **Step 5:** Write a second `@ParameterizedTest` with `@ValueSource` for the invalid ages -1 and 121 using `assertThrows()`.
6. **Step 6:** Run the tests using `mvn test` and verify the output.
7. **Step 7:** Stop.

## Program Code
- **Implementation:** `VoteChecker.java`
- **Test Class:** `VoteCheckerTest.java`

## Execution Instructions
```bash
mvn test -Dtest=VoteCheckerTest
```

## Expected Output
```
[INFO] Running com.csa37.co2.ex27.VoteCheckerTest
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## Actual Execution Status
Verified with 7 boundary test cases for age validation.

## Result
Thus the JUnit test cases to validate voting eligibility based on age using boundary value analysis in JUnit were executed successfully and the output was verified.
