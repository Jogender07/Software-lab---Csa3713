package com.csa37.co2.ex30;

public class MaxFinder {
    public static int largest(int a, int b, int c) {
        if (a >= b) {
            if (a >= c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b >= c) {
                return b;
            } else {
                return c;
            }
        }
    }
}
