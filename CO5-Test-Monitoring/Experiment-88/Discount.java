public class Discount {
    public static double discount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (amount > 1000) { // seeded defect: should be amount >= 1000
            return amount * 0.10;
        }
        return 0;
    }
}
