package StepDefinition.Scholastic;

import Pages.Scholastic.MyAccountsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class RecommendListSD {


    MyAccountsPage myAccountsPage = new MyAccountsPage();


    @When("^I search (.*) using search box$")
    public void search(String mySearch) {
        myAccountsPage.typeAndSearch(mySearch);
    }

    @When("^I click on 'star' icon$")
    public void clickOnIcon() {
        myAccountsPage.clickStar();
    }

    @Then("^I verify item is added to recommend list$")
    public void verifyItemInRecommendList() {
        Assert.assertTrue(myAccountsPage.starActive());
        Assert.assertTrue(myAccountsPage.verifyIfContainsItems());
        Assert.assertTrue(myAccountsPage.verifyItemInRecommendList());
    }
}
