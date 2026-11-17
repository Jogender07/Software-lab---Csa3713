import java.util.Random;

public class DiceUtil {
    private static final Random RANDOM = new Random();
    public static int roll() {
        return RANDOM.nextInt(6) + 1;
    }
}
