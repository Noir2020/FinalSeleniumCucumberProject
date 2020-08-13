package StepDefinition.Hotels;

import Drivers.Web;
import Pages.Hotels.LandingPage;
import Pages.Hotels.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class StarRatingHotelsSD {

    LandingPage landingPage = new LandingPage();
    SearchPage searchPage = new SearchPage();


    @Given("^I am on default locations search result screen$")
    public void launchHotelsLP() throws InterruptedException {
        Web.initDriver("https://www.hotels.com/");

        landingPage.typeInSearchForDestination();

        landingPage.clickSubmitButton();

        searchPage.moveMouseToDestinationDropDownAndPickLaGuardia();
    }

    @When("^I click on (.*) star$")
    public void clickStar(String valueOfStar) {
      searchPage.clickCheckBox(valueOfStar);
    }

    @Then("^I verify hotels are (.*) star rating$")
    public void verifyHotelsStarRating(String star) throws InterruptedException {
        searchPage.scrollUntilEverythingLoads();
        Assert.assertTrue(searchPage.compareAllElements(star));
    }

}
