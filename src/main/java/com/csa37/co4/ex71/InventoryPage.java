package com.csa37.co4.ex71;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    private final WebDriver driver;
    private final By title = By.className("title");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public String heading() {
        return driver.findElement(title).getText();
    }
}
