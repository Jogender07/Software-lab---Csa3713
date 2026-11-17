package com.csa37.co5.ex86;

import java.util.Arrays;

public class PerfUtil {
    public static int[] sort(int[] a) {
        int[] copy = Arrays.copyOf(a, a.length);
        Arrays.sort(copy);
        return copy;
    }

    public static int linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
