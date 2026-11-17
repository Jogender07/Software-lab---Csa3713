import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InterestCalculatorTest {
    @Test
    @Tag("TC01")
    @DisplayName("TC01 : Regular customer gets 6.0% interest")
    void regularCustomerRate() {
        assertEquals(120.0, InterestCalculator.simpleInterest("REGULAR", 1000, 2), 0.001);
    }

    @Test
    @Tag("TC02")
    @DisplayName("TC02 : Senior customer gets 7.5% interest")
    void seniorCustomerRate() {
        assertEquals(150.0, InterestCalculator.simpleInterest("SENIOR", 1000, 2), 0.001);
    }

    @Test
    @Tag("TC03")
    @DisplayName("TC03 : Staff member gets 8.0% interest")
    void staffCustomerRate() {
        assertEquals(160.0, InterestCalculator.simpleInterest("STAFF", 1000, 2), 0.001);
    }

    @Test
    @Tag("TC04")
    @DisplayName("TC04 : Unknown customer type throws IllegalArgumentException")
    void unknownCustomerThrows() {
        assertThrows(IllegalArgumentException.class,
                () -> InterestCalculator.simpleInterest("STUDENT", 1000, 2));
    }
}
