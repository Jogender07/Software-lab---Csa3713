package com.csa37.co5.ex85;

public class ArmstrongUtil {
    private ArmstrongUtil() { }

    public static boolean isArmstrong(int n) {
        if (n < 0) {
            return false;
        }
        int digits = String.valueOf(n).length();
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            sum += (int) Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == n;
    }
}
