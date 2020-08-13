package StepDefinition.Scholastic;

import Pages.Scholastic.MyAccountsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class JumperSD {

    MyAccountsPage myAccountsPage = new MyAccountsPage();

    @When("^I go to YTO page$")
    public void goToYTO() {
        myAccountsPage.clickYTO();
    }

    @When("^I go to By Flyer tab$")
    public void flyerTab() {
        myAccountsPage.selectFlyer();
    }

    @When("^I click on BonusPoint-Qty box$")
    public void clickBonusBox() {
        myAccountsPage.clickBonus();
    }

    @Then("^I verify jumper is NOT displayed$")
    public void verifyJumperIsNotDisplayed() {
        Assert.assertFalse(myAccountsPage.jumperDisplayed());
    }

    @When("^I click on Price-Qty box$")
    public void clickQuantityBox() {
        myAccountsPage.clickQuantity();
    }

    @Then("^I verify jumper is displayed$")
    public void verifyJumperIsDisplayed() {
        Assert.assertTrue(myAccountsPage.jumperDisplayed());
    }

    @When("^I click on Price-Qty again$")
    public void clickPriceQtyAgain() {
        myAccountsPage.clickQuantity1();
    }
}
