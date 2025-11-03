package com.kavya.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // 1. Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // 2. Locators (Web Elements)
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");

    // 3. Actions (Methods)
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public InventoryPage clickLogin() {
        driver.findElement(loginButton).click();
        // Returning the next Page Object ensures a proper flow (Page Chaining)
        return new InventoryPage(driver); 
    }
    
    public String getErrorMessage() {
        return driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
    }
}