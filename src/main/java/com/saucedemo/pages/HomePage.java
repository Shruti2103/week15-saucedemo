package com.saucedemo.pages;


import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement usernameclcik;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordclick;

    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginclick;


    public void clickonUsername(String name) {
        sendTextToElement(usernameclcik, name);
        log.info("Enter name "+name+ " to email field "+usernameclcik.toString() );
    }

    public void clickonpassword(String password) {
        sendTextToElement(passwordclick, password);
        log.info("Enter password "+password+ " to email field "+passwordclick.toString() );
    }


    public void clickonlogin() {
        clickOnElement(loginclick);
        log.info("Clicking on  login click "+ loginclick.toString());
    }


}
