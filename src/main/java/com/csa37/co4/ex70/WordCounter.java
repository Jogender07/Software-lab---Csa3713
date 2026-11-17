package com.csa37.co4.ex70;

public class WordCounter {
    public static int count(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        return text.trim().split("\\s+").length;
    }
}
