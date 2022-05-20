package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(YourCartPage.class.getName());

    public YourCartPage() {
        PageFactory.initElements(driver, this);


    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutclcik;


    public void clickoncheckout() {
        clickOnElement(checkoutclcik);
        log.info("Clicking on checkout clcik " + checkoutclcik.toString());
    }


}
