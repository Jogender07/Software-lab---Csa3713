package com.csa37.co5.ex88;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountTest {
    @Test
    void noDiscountBelowLimit() {
        assertEquals(0, Discount.discount(999), 0.001);
    }

    @Test
    @Disabled("Demonstrates seeded boundary defect caught by TestRunner")
    void discountAtLimit() {
        assertEquals(100, Discount.discount(1000), 0.001);
    }

    @Test
    void discountAboveLimit() {
        assertEquals(200, Discount.discount(2000), 0.001);
    }

    @Test
    void negativeAmountThrows() {
        assertThrows(IllegalArgumentException.class, () -> Discount.discount(-1));
    }
}
