# Exercise 8: Reverse a Given String and Validate using JUnit Assertions (JUnit)

## Aim
To write JUnit test cases to reverse a given string and validate the output using JUnit assertions.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. **Step 2:** Write the class `StringUtil` with the method `reverse(String s)` that returns null for a null input and otherwise returns the reversed string using StringBuilder.
3. **Step 3:** Write the test class `StringUtilTest` and use `assertEquals()` to verify the reverse of a word, an empty string and a palindrome.
4. **Step 4:** Use `assertNotNull()` and `assertNull()` to verify the result for valid and null inputs.
5. **Step 5:** Run the tests using `mvn test` and verify the output.
6. **Step 6:** Stop.

## Program Code
- **Implementation:** `StringUtil.java`
- **Test Class:** `StringUtilTest.java`

## Execution Instructions
```bash
# From repository root
mvn test -Dtest=StringUtilTest
```

## Expected Output
```
[INFO] Running com.csa37.co1.ex08.StringUtilTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## Actual Execution Status
Verified and Executed via Maven Surefire test engine. All 3 tests passed.

## Result
Thus the JUnit test cases to reverse a given string and validate the output using JUnit assertions were executed successfully and the output was verified.
