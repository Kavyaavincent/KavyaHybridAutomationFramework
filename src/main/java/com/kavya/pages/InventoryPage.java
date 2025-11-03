package com.kavya.pages;

import org.openqa.selenium.WebDriver;

public class InventoryPage {
    WebDriver driver;

    // Constructor
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    // You can add elements and actions for the inventory page here later
    public boolean isPageLoaded() {
        return driver.getCurrentUrl().contains("inventory");
    }
}