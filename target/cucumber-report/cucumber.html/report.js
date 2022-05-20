$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10786838100,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#  As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by Hight to Low filter."
    }
  ],
  "line": 4,
  "name": "User navigates saucedemo page and complete the item purchas",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchas",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am  on  saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login with credential username \"standard_user\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I login with credential  password \"secret_sauce\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I filter the products by Price \"Price (high to low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select cheapest \u0026 costliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter details firstname \"firstName\", lastName \"lastName\" and zipPostalCode \"Zip/PostalCode\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should be able to see message \u0027Thank you for your order\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchTest.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 477289900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 34
    }
  ],
  "location": "SearchTest.iLoginWithCredentialUsername(String)"
});
formatter.result({
  "duration": 392862300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 35
    }
  ],
  "location": "SearchTest.iLoginWithCredentialPassword(String)"
});
formatter.result({
  "duration": 291649800,
  "status": "passed"
});
formatter.match({
  "location": "SearchTest.iClickOnLoginButton()"
});
formatter.result({
  "duration": 695976700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (high to low)",
      "offset": 32
    }
  ],
  "location": "SearchTest.iFilterTheProductsByPrice(String)"
});
formatter.result({
  "duration": 701172000,
  "status": "passed"
});
formatter.match({
  "location": "SearchTest.iSelectCheapestCostliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 5587519200,
  "status": "passed"
});
formatter.match({
  "location": "SearchTest.iOpenShoppingCart()"
});
formatter.result({
  "duration": 209613200,
  "status": "passed"
});
formatter.match({
  "location": "SearchTest.iGoToCheckout()"
});
formatter.result({
  "duration": 223322500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "firstName",
      "offset": 27
    },
    {
      "val": "lastName",
      "offset": 49
    },
    {
      "val": "Zip/PostalCode",
      "offset": 78
    }
  ],
  "location": "SearchTest.iEnterDetailsFirstnameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 1134316500,
  "status": "passed"
});
formatter.match({
  "location": "SearchTest.iClickOnContinueButton()"
});
formatter.result({
  "duration": 232330300,
  "status": "passed"
});
formatter.match({
  "location": "SearchTest.iClickOnFinishButton()"
});
formatter.result({
  "duration": 180965600,
  "status": "passed"
});
formatter.match({
  "location": "SearchTest.iShouldBeAbleToSeeMessageThankYouForYourOrder()"
});
formatter.result({
  "duration": 121042800,
  "status": "passed"
});
formatter.after({
  "duration": 2470372700,
  "status": "passed"
});
});