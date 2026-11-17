import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {
    @Test
    void freezingPoint() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 0.001);
    }

    @Test
    void boilingPoint() {
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100), 0.001);
    }

    @Test
    void minusFortyIsSameInBothScales() {
        assertEquals(-40.0, TemperatureConverter.celsiusToFahrenheit(-40), 0.001);
    }
}
