import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

public class TicketFareTest {
    static Stream<Arguments> fareData() {
        return Stream.of(
            Arguments.of(4,  "SL", 0.0),
            Arguments.of(5,  "SL", 150.0),
            Arguments.of(12, "AC", 400.0),
            Arguments.of(13, "AC", 800.0),
            Arguments.of(59, "SL", 300.0),
            Arguments.of(60, "AC", 480.0)
        );
    }

    @ParameterizedTest(name = "age {0}, class {1} -> fare {2}")
    @MethodSource("fareData")
    void fareForTestData(int age, String travelClass, double expected) {
        assertEquals(expected, TicketFare.fare(age, travelClass), 0.001);
    }

    @Test
    void invalidClassThrows() {
        assertThrows(IllegalArgumentException.class, () -> TicketFare.fare(30, "XX"));
    }
}
