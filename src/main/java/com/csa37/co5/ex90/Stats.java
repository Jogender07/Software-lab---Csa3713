package com.csa37.co5.ex90;

public class Stats {
    public static double average(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        long sum = 0;
        for (int v : values) {
            sum += v;
        }
        return (double) sum / values.length; // DEF-07 fixed: integer division removed
    }
}
