package com.csa37.co5.ex90;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatsTest {
    @Test
    @Tag("confirmation")
    void defect07_averageOfOneAndTwoIsOnePointFive() {
        assertEquals(1.5, Stats.average(new int[]{1, 2}), 0.001);
    }

    @Test
    @Tag("regression")
    void averageOfThreeNumbers() {
        assertEquals(20.0, Stats.average(new int[]{10, 20, 30}), 0.001);
    }

    @Test
    @Tag("regression")
    void averageOfSingleNumber() {
        assertEquals(7.0, Stats.average(new int[]{7}), 0.001);
    }

    @Test
    @Tag("regression")
    void averageOfNegativeNumbers() {
        assertEquals(0.0, Stats.average(new int[]{-2, 2}), 0.001);
    }

    @Test
    @Tag("regression")
    void emptyArrayThrows() {
        assertThrows(IllegalArgumentException.class, () -> Stats.average(new int[]{}));
    }
}
