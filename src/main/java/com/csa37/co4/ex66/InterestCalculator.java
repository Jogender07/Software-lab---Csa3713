package com.csa37.co4.ex66;

public class InterestCalculator {
    public static double simpleInterest(String customerType, double principal, int years) {
        double rate;
        switch (customerType) {
            case "REGULAR": rate = 6.0; break;
            case "SENIOR":  rate = 7.5; break;
            case "STAFF":   rate = 8.0; break;
            default:
                throw new IllegalArgumentException("Unknown customer type: " + customerType);
        }
        return principal * rate * years / 100;
    }
}
