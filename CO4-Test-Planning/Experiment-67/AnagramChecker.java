import java.util.Arrays;

public class AnagramChecker {
    public static boolean isAnagram(String a, String b) {
        if (a == null || b == null) {
            return false;
        }
        char[] x = a.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] y = b.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }
}
