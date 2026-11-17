public class LoginValidator {
    public static boolean isValid(String username, String password) {
        if (username == null || password == null) return false;
        return !username.trim().isEmpty() && password.length() >= 6;
    }
}
