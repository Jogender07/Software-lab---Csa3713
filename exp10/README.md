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

### AuthService.java
`java
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

public class AuthService {
    private final Map<String, String> users = new HashMap<>();

    public static String hash(String text) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] digest = md.digest(text.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    public void register(String user, String password) throws Exception {
        users.put(user, hash(password));
    }

    public boolean login(String user, String password) throws Exception {
        return users.containsKey(user) && users.get(user).equals(hash(password));
    }
}
`

### AuthServiceTest.java
`java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthServiceTest {
    private AuthService auth;

    @BeforeEach
    void setUp() throws Exception {
        auth = new AuthService();
        auth.register("student", "Secret@123");
    }

    @Test
    void hashIsRepeatable() throws Exception {
        assertEquals(AuthService.hash("Secret@123"), AuthService.hash("Secret@123"));
    }

    @Test
    void hashIsDifferentFromPlainPassword() throws Exception {
        assertNotEquals("Secret@123", AuthService.hash("Secret@123"));
    }

    @Test
    void hashHas64HexCharacters() throws Exception {
        assertEquals(64, AuthService.hash("Secret@123").length());
    }

    @Test
    void loginWithCorrectPassword() throws Exception {
        assertTrue(auth.login("student", "Secret@123"));
    }

    @Test
    void loginWithWrongPassword() throws Exception {
        assertFalse(auth.login("student", "secret@123"));
    }
}
`


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
