package com.csa37.co4.ex74;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CrossBrowserTest {
    @ParameterizedTest(name = "browser = {0}")
    @ValueSource(strings = {"chrome", "firefox"})
    void titleIsSameInAllBrowsers(String browser) {
        WebDriver driver = null;
        try {
            if (browser.equals("firefox")) {
                try {
                    FirefoxOptions options = new FirefoxOptions();
                    options.addArguments("--headless");
                    driver = new FirefoxDriver(options);
                } catch (Throwable e) {
                    Assumptions.assumeTrue(false, "Firefox driver unavailable in environment: " + e.getMessage());
                }
            } else {
                try {
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--headless=new");
                    driver = new ChromeDriver(options);
                } catch (Throwable e) {
                    Assumptions.assumeTrue(false, "Chrome driver unavailable in environment: " + e.getMessage());
                }
            }
            if (driver != null) {
                driver.get("https://www.saucedemo.com");
                assertEquals("Swag Labs", driver.getTitle());
            }
        } finally {
            if (driver != null) {
                try {
                    driver.quit();
                } catch (Throwable ignored) {
                }
            }
        }
    }
}
