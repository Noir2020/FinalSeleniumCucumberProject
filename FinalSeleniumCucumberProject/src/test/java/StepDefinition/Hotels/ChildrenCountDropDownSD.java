package StepDefinition.Hotels;

import Drivers.Web;
import Pages.Hotels.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ChildrenCountDropDownSD {

    LandingPage landingPage = new LandingPage();

    @Given("^I am on hotels landing page$")
    public void launchHotels(){
        Web.initDriver("https://www.hotels.com/");
    }

    @When("^I select (.*) in children dropdown$")
    public void selectDropDown(String numOfChildren) {
        landingPage.selectChildrenDropDown(numOfChildren);
    }

    @Then("^I see (.*) child age dropdowns$")
    public void verifyChildAgeDropdowns(int childrenCount) {
        Assert.assertTrue(landingPage.verifyNumAgeDropdowns(childrenCount));
    }


}