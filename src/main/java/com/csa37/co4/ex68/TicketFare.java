package com.csa37.co4.ex68;

public class TicketFare {
    public static double fare(int age, String travelClass) {
        double base;
        switch (travelClass) {
            case "SL": base = 300; break;
            case "AC": base = 800; break;
            default:
                throw new IllegalArgumentException("Invalid class: " + travelClass);
        }
        if (age < 5) return 0;
        if (age <= 12) return base * 0.5;
        if (age >= 60) return base * 0.6;
        return base;
    }
}
