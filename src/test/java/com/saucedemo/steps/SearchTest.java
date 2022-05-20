package com.saucedemo.steps;

import com.saucedemo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SearchTest {
    @Given("^I am  on  saucedemo page$")
    public void iAmOnSaucedemoPage() {
    }

    @When("^I login with credential username \"([^\"]*)\"$")
    public void iLoginWithCredentialUsername(String name) {
        new HomePage().clickonUsername(name);
    }

    @And("^I login with credential  password \"([^\"]*)\"$")
    public void iLoginWithCredentialPassword(String password) {
        new HomePage().clickonpassword(password);
    }

    @Then("^I click on Login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickonlogin();
    }

    @And("^I filter the products by Price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice(String pricehighest) {
        new ProductsPage().clickHightoLowPrice(pricehighest);

    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() throws InterruptedException {
        Thread.sleep(5000);
        new ProductsPage().clickonaddtocartProductLowest();
        new ProductsPage().clickonhighestpriceaddtocart();

    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new ProductsPage().clickonshoppingcart();

    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new YourCartPage().clickoncheckout();


    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String firstname, String lastname, String zipPostalCode) {

        new CheckoutYourInformation().enterfirstname(firstname);
        new CheckoutYourInformation().enterlastname(lastname);
        new CheckoutYourInformation().enterzipcode(zipPostalCode);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckoutYourInformation().clickoncontinue();


    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new FinishPage().clickOnFinishButton();

    }

    @Then("^I should be able to see message 'Thank you for your order'$")
    public void iShouldBeAbleToSeeMessageThankYouForYourOrder() {
        Assert.assertEquals("Not navigate to page","THANK YOU FOR YOUR ORDER", new ThankyouCheckoutCompletePage().verifyThankYoutext());


    }
}
