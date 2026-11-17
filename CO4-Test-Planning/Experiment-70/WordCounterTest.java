import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ResultLogger.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class WordCounterTest {
    @Test
    @Order(1)
    void countsWords() {
        assertEquals(4, WordCounter.count("the quick brown fox"));
    }

    @Test
    @Order(2)
    void emptyStringHasZeroWords() {
        assertEquals(0, WordCounter.count(""));
    }

    @Test
    @Order(3)
    void multipleSpacesAreIgnored() {
        assertEquals(2, WordCounter.count("a    b"));
    }

    @Test
    @Order(4)
    @Disabled("Feature pending")
    void punctuationHandling() {
        assertEquals(2, WordCounter.count("hello, world!"));
    }
}
