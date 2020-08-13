package Pages.Hotels;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage extends BasePage {


    By childrenCountDropDown = By.xpath("//select[@id='qf-0q-room-0-children']");
    By childAgeDropDown = By.xpath("//select[contains(@id,'qf-0q-room-0-child-')]");


    By destinationSearchOnLanding = By.xpath("//input[@id='qf-0q-destination']");
    By autoAllDest = By.xpath("//div[@class='autosuggest-category-result']");
    By selectButtonLocator = By.xpath("//button[@type='submit']");


    public void selectChildrenDropDown(String childrenCount) {
        selectFromDropdownByVisibleText(childrenCountDropDown,childrenCount);
    }

    public void typeInSearchForDestination() throws InterruptedException {
        type(destinationSearchOnLanding, "New York");
        Thread.sleep(3000);
        selectFromAutoSuggestion(autoAllDest, "New York, New York, United States of America");
    }

    public void clickSubmitButton() {
        clickThis(selectButtonLocator);
    }


    public boolean verifyNumAgeDropdowns(int childrenCount) {
        List<WebElement> allAgeDropdowns = findElementsUsingFluentWait(childAgeDropDown);
        boolean isMatchingNumOfDropdowns=(allAgeDropdowns.size()==childrenCount);
        return isMatchingNumOfDropdowns;
    }
}