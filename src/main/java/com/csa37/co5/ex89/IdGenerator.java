package com.csa37.co5.ex89;

public class IdGenerator {
    private static int counter = 0;
    public static synchronized int nextId() {
        return ++counter;
    }
}
