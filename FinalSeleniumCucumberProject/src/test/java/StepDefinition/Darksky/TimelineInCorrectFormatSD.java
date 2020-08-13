package StepDefinition.Darksky;

import Drivers.Web;
import Pages.BasePage;
import Pages.Darksky.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TimelineInCorrectFormatSD {

    LandingPage landingPage = new LandingPage();

    @Given("^I am on Darksky home page$")
    public void launchDarksky() throws InterruptedException {
        Web.initDriver("https://darksky.net/");
        Thread.sleep(2000);
    }

    @When("^I verify timeline is displayed with (.*) hours increment$")
    public void verifyTimelineFormatIncrement(int interval) {
        Assert.assertTrue(landingPage.verifyTimelineFormat(interval));
    }


}

