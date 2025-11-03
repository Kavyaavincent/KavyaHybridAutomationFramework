package com.kavya.tests;

import com.kavya.base.BaseClass;
import com.kavya.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

// Inherit setup() and tearDown() from BaseClass
public class LoginTest extends BaseClass {

    @Test(description = "Verify successful login with valid credentials")
    public void successfulLoginTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("standard_user"); // Valid username
        loginPage.enterPassword("secret_sauce");  // Valid password
        
        // This clicks login and returns the next page object
        loginPage.clickLogin(); 

        // Assertion: Verify that the URL changed to the inventory page
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        
        Assert.assertEquals(actualUrl, expectedUrl, "Login failed: Expected URL mismatch.");
    }

    @Test(description = "Verify error message for invalid credentials")
    public void invalidLoginTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("wrong_user"); 
        loginPage.enterPassword("wrong_password");  
        loginPage.clickLogin(); 

        // Assertion: Verify the error message text
        String expectedError = "Epic sadface: Username and password do not match any user in this service";
        String actualError = loginPage.getErrorMessage();
        
        Assert.assertEquals(actualError, expectedError, "Error message mismatch.");
    }
}