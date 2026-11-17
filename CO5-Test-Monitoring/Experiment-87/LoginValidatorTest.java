import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class LoginValidatorTest {
    @Test
    void validLogin() {
        assertTrue(LoginValidator.isValid("student", "secret1"));
    }

    @Test
    @EnabledIfSystemProperty(named = "env", matches = "qa")
    void shortPasswordRejectedInQaOnly() {
        assertFalse(LoginValidator.isValid("student", "abc"));
    }

    @Test
    @Disabled("Feature under development")
    void captchaIsRequired() {
        fail("Not implemented yet");
    }

    @Test
    void emptyUserRejectedWhenRunningInQa() {
        assumeTrue("qa".equals(System.getProperty("env")));
        assertFalse(LoginValidator.isValid("", "secret1"));
    }
}
