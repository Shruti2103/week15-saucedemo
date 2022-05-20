package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutYourInformation extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutYourInformation.class.getName());

    public CheckoutYourInformation() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement zipcode;

    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueclick;

    public void enterfirstname(String name) {
        sendTextToElement(firstName, name);
        log.info("Enter name "+name+ " to email field "+firstName.toString() );
    }

    public void enterlastname(String surname) {
        sendTextToElement(lastName, surname);
        log.info("Enter surname "+surname+ " to email field "+lastName.toString() );
    }

    public void enterzipcode(String postcode) {
        sendTextToElement(zipcode, postcode);
        log.info("Enter postcode "+postcode+ " to email field "+zipcode.toString() );
    }

    public void clickoncontinue() {
        clickOnElement(continueclick);
        log.info("Clicking on  continue click "+ continueclick.toString());
    }


}
