package com.csa37.co4.ex67;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramCheckerTest {
    @ParameterizedTest(name = "TD{index}: {0} / {1} -> {2}")
    @CsvSource({
        "listen,silent,true",
        "Triangle,Integral,true",
        "apple,pale,false",
        "Dormitory,Dirty room,true",
        "abc,abd,false"
    })
    void testDataTable(String first, String second, boolean expected) {
        assertEquals(expected, AnagramChecker.isAnagram(first, second));
    }

    @Test
    void nullInputReturnsFalse() {
        assertFalse(AnagramChecker.isAnagram(null, "abc"));
    }
}
