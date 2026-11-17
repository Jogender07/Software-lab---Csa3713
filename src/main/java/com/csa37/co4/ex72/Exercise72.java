package com.csa37.co4.ex72;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Exercise72 {
    public static void main(String[] args) throws Exception {
        List<String> lines = Files.readAllLines(Paths.get("users.csv"));
        WebDriver driver = new ChromeDriver();
        try {
            int row = 1;
            for (String line : lines.subList(1, lines.size())) {
                String[] f = line.split("\\|");
                driver.manage().deleteAllCookies();
                driver.get("https://www.saucedemo.com");
                driver.findElement(By.id("user-name")).sendKeys(f[0]);
                driver.findElement(By.id("password")).sendKeys(f[1]);
                driver.findElement(By.id("login-button")).click();
                List<WebElement> errors = driver.findElements(By.cssSelector("[data-test='error']"));
                String actual = errors.isEmpty()
                        ? driver.findElement(By.className("title")).getText()
                        : errors.get(0).getText();
                System.out.println("Row " + row + " : " + f[0] + " / " + f[1]
                        + " -> " + (actual.equals(f[2]) ? "PASS" : "FAIL"));
                row++;
            }
        } finally {
            driver.quit();
        }
    }
}
