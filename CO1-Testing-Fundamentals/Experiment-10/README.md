# Exercise 10: Implement Security Testing for Password Hashing and Authentication using JUnit (JUnit)

## Aim
To write JUnit test cases to implement security testing for password hashing and authentication using JUnit assertions.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. **Step 2:** Write the class `AuthService` with the method `hash()` that converts a password into a SHA-256 hexadecimal string using `MessageDigest`.
3. **Step 3:** Add the methods `register()` to store the hashed password and `login()` to compare the hash of the entered password with the stored hash.
4. **Step 4:** Write the test class `AuthServiceTest` to verify that the hash is repeatable, is different from the plain password and has 64 hexadecimal characters.
5. **Step 5:** Verify that `login()` returns true for the correct password and false for a wrong password.
6. **Step 6:** Run the tests using `mvn test` and verify the output.
7. **Step 7:** Stop.

## Program Code
- **Implementation:** `AuthService.java`
- **Test Class:** `AuthServiceTest.java`

## Execution Instructions
```bash
# From repository root
mvn test -Dtest=AuthServiceTest
```

## Expected Output
```
[INFO] Running com.csa37.co1.ex10.AuthServiceTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## Actual Execution Status
Verified and Executed via Maven Surefire test engine. All 5 security assertions passed.

## Result
Thus the JUnit test cases to implement security testing for password hashing and authentication using JUnit assertions were executed successfully and the output was verified.
