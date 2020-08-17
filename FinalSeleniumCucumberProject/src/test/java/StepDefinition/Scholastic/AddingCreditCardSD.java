package StepDefinition.Scholastic;

import Pages.Scholastic.LandingPage;
import Pages.Scholastic.MyAccountsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AddingCreditCardSD {

    MyAccountsPage myAccountsPage = new MyAccountsPage();

    @When("^I add credit card number (.*)$")
    public void addingCreditCard(String number) {
        myAccountsPage.addCreditCard(number);
    }

    @Then("^I verify credit card ending (.*) is added successfully in My Accounts$")
    public void verifyCardInMyAccount(String number) {
        Assert.assertTrue(myAccountsPage.verifyCardNumber(number));
    }

    @Then("^I verify added card ending (.*) is displayed when shopping using credit card$")
    public void verifyCardIsDisplayed(String number) {
        myAccountsPage.clickYTO();
        myAccountsPage.typeQuantity("10");
        myAccountsPage.clickReviewCart();
        myAccountsPage.clickProceed();
        myAccountsPage.clickProceed2();
        myAccountsPage.clickContinueCheckOut();
        myAccountsPage.choosePaymentMethod();
        Assert.assertTrue(myAccountsPage.verifyCard(number));
    }
}
