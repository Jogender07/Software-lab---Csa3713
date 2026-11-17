package com.csa37.co1.ex08;

public class StringUtil {
    public static String reverse(String s) {
        if (s == null) {
            return null;
        }
        return new StringBuilder(s).reverse().toString();
    }
}
