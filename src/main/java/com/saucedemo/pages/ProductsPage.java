package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductsPage.class);

    public ProductsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class=\"select_container\"]")
    WebElement usernameclcik;

    @CacheLookup
    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement hightolowprice;

    @CacheLookup
    @FindBy(xpath = "//div[@class='inventory_list']/div[1]/div/div/button")
    WebElement addtocartproducthighest;


    @CacheLookup
    @FindBy(xpath = "//div[@class='inventory_list']/div[6]/div/div/button")
    WebElement addtocartproductlowest;

    @CacheLookup
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement shoppingcartclick;


    public void clickonUsername(String name) {
        sendTextToElement(usernameclcik, name);
        log.info("Enter email "+name+ " to email field "+usernameclcik.toString() );
    }

    public void clickHightoLowPrice(String priceh) {
        selectByVisibleTextFromDropDown(hightolowprice, priceh);
        log.info("Selecting price "+priceh+" from dropdown "+hightolowprice.toString() );
    }

    public void clickonhighestpriceaddtocart() {
        clickOnElement(addtocartproducthighest);
        log.info("Clicking on add to cart product highest Btn "+ addtocartproducthighest.toString());
    }

    public void clickonaddtocartProductLowest() {
        clickOnElement(addtocartproductlowest);
        log.info("Clicking on add to cart product lowest Btn "+ addtocartproductlowest.toString());
    }

    public void clickonshoppingcart() {
        clickOnElement(shoppingcartclick);
        log.info("Clicking on shopping cart click Btn"+ shoppingcartclick.toString());
    }


}
