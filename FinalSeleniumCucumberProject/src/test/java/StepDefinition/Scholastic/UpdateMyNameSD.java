package StepDefinition.Scholastic;

import Drivers.Web;
import Pages.Scholastic.LandingPage;
import Pages.Scholastic.MyAccountsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class UpdateMyNameSD {

    String name;

    LandingPage landingPage = new LandingPage();
    MyAccountsPage myAccountsPage = new MyAccountsPage();

    @Given("^I am on the Homepage$")
    public void launchScholastic() {
        Web.initDriver("https://clubs3qa1.scholastic.com/home");
    }

    @When("^I Login$")
    public void login() {
        landingPage.clickSignin();
    }

    @When("^I go to My Accounts page$")
    public void goToMyProfile() {
        myAccountsPage.clickAccountProfile();
    }

    @When("^I update the name to (.*)$")
    public void updateMyName(String name2) {
        name = name2;
        myAccountsPage.clickEditLastName(name);
    }

    @Then("^I verify name is updated successfully in My Accounts$")
    public void verifyNameInMyAccounts() {
        Assert.assertTrue(myAccountsPage.getTextAccountName(name));
    }

    @Then("^I verify name is updated successfully in Page Header$")
    public void verifyNameInHeader() {
        Assert.assertTrue(myAccountsPage.getTextHeaderName(name));
    }
}
