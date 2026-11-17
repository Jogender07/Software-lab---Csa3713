import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private final Map<String, Double> price = new HashMap<>();
    private final Map<String, Integer> qty = new HashMap<>();

    public void add(String item, double unitPrice, int quantity) {
        if (quantity <= 0) throw new IllegalArgumentException("Quantity must be positive");
        price.put(item, unitPrice);
        qty.merge(item, quantity, Integer::sum);
    }

    public void remove(String item) {
        price.remove(item);
        qty.remove(item);
    }

    public int itemCount() {
        return qty.values().stream().mapToInt(Integer::intValue).sum();
    }

    public double total() {
        double t = 0;
        for (String k : qty.keySet()) {
            t += price.get(k) * qty.get(k);
        }
        return t;
    }
}
