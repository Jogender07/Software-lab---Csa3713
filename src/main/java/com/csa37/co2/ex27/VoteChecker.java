package com.csa37.co2.ex27;

public class VoteChecker {
    public static boolean isEligible(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age");
        }
        return age >= 18;
    }
}
