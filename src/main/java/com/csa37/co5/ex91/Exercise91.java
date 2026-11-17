package com.csa37.co5.ex91;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exercise91 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            String base = "https://the-internet.herokuapp.com";
            driver.get(base);
            boolean tc1 = driver.getTitle().equals("The Internet");
            driver.get(base + "/login");
            boolean tc2 = driver.findElement(By.tagName("h2")).getText().equals("Login Page");
            driver.get(base + "/checkboxes");
            boolean tc3 = driver.findElements(By.cssSelector("input[type='checkbox']")).size() == 2;
            boolean[] results = {tc1, tc2, tc3};
            String[] names = {"Home page title", "Login page heading", "Checkbox count"};
            List<String> log = new ArrayList<>();
            log.add("TC_ID,Description,Status");
            int passed = 0;
            for (int i = 0; i < results.length; i++) {
                if (results[i]) passed++;
                log.add("TC0" + (i + 1) + "," + names[i] + "," + (results[i] ? "PASS" : "FAIL"));
            }
            Files.write(Paths.get("results.csv"), log);
            log.forEach(System.out::println);
            System.out.printf("Passed %d of %d | Pass percentage = %.2f%%%n",
                    passed, results.length, passed * 100.0 / results.length);
        } finally {
            driver.quit();
        }
    }
}
