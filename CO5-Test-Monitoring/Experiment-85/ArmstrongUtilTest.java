import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class ArmstrongUtilTest {
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 153, 370, 371, 407, 9474})
    void armstrongNumbers(int n) {
        assertTrue(ArmstrongUtil.isArmstrong(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 123, 9475})
    void nonArmstrongNumbers(int n) {
        assertFalse(ArmstrongUtil.isArmstrong(n));
    }

    @Test
    void negativeNumberIsNotArmstrong() {
        assertFalse(ArmstrongUtil.isArmstrong(-153));
    }
}
