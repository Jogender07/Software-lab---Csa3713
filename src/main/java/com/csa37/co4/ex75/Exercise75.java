package com.csa37.co4.ex75;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise75 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/windows");
            String parent = driver.getWindowHandle();
            driver.findElement(By.linkText("Click Here")).click();
            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(parent)) {
                    driver.switchTo().window(handle);
                }
            }
            System.out.println("Child window title  : " + driver.getTitle());
            System.out.println("Child window text   : " + driver.findElement(By.tagName("h3")).getText());
            driver.close();
            driver.switchTo().window(parent);
            System.out.println("Parent window title : " + driver.getTitle());
        } finally {
            driver.quit();
        }
    }
}
