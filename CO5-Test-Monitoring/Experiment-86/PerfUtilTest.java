import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

public class PerfUtilTest {
    private final int[] data = new Random(42).ints(100000, 0, 1_000_000).toArray();

    @Test
    void sortFinishesWithin500ms() {
        int[] sorted = assertTimeout(Duration.ofMillis(500), () -> PerfUtil.sort(data));
        assertEquals(data.length, sorted.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    void searchFinishesWithinOneSecond() {
        int key = data[data.length / 2];
        int index = PerfUtil.linearSearch(data, key);
        assertTrue(index >= 0);
    }
}
