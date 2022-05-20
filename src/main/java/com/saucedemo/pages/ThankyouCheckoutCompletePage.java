package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankyouCheckoutCompletePage extends Utility {

    private static final Logger log = LogManager.getLogger(ThankyouCheckoutCompletePage.class.getName());

    public ThankyouCheckoutCompletePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[@class='complete-header']")
    WebElement thankyoumessage;

    public String verifyThankYoutext() {
        log.info("getting Thankyou Message text  " + thankyoumessage.toString());
        return getTextFromElement(thankyoumessage);
    }


}
