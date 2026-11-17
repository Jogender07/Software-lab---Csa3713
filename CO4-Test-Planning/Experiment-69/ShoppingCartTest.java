import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @Nested
    @DisplayName("Adding items")
    class AddingItems {
        @Test
        void quantitiesAreAdded() {
            cart.add("Pen", 10, 2);
            cart.add("Pen", 10, 3);
            assertEquals(5, cart.itemCount());
        }

        @Test
        void zeroQuantityIsRejected() {
            assertThrows(IllegalArgumentException.class, () -> cart.add("Pen", 10, 0));
        }
    }

    @Nested
    @DisplayName("Removing items")
    class RemovingItems {
        @Test
        void removedItemIsNotCounted() {
            cart.add("Pen", 10, 2);
            cart.remove("Pen");
            assertEquals(0, cart.itemCount());
        }
    }

    @Nested
    @DisplayName("Totals")
    class Totals {
        @Test
        void totalOfTwoItems() {
            cart.add("Pen", 10, 3);
            cart.add("Book", 250, 1);
            assertEquals(280, cart.total(), 0.001);
        }

        @Test
        void emptyCartTotalIsZero() {
            assertEquals(0, cart.total(), 0.001);
        }
    }
}
