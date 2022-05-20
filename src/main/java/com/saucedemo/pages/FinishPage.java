package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishPage extends Utility {
    private static final Logger log = LogManager.getLogger(FinishPage.class.getName());

    public FinishPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton;


    public void clickOnFinishButton() {
        clickOnElement(finishButton);
        log.info("Clicking on finish Button " + finishButton.toString());


    }
}