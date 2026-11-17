import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import static org.junit.jupiter.api.Assertions.*;

public class RepeatedBehaviourTest {
    private static int lastId = 0;

    @RepeatedTest(value = 5, name = "id repetition {currentRepetition}/{totalRepetitions}")
    void idsAreStrictlyIncreasing(RepetitionInfo info) {
        int id = IdGenerator.nextId();
        assertTrue(id > lastId, "Id must increase in repetition " + info.getCurrentRepetition());
        lastId = id;
    }

    @RepeatedTest(10)
    void diceStaysInRange() {
        int value = DiceUtil.roll();
        assertTrue(value >= 1 && value <= 6);
    }
}
