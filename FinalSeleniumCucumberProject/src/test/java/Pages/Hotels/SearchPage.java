package Pages.Hotels;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends BasePage {

    By distanceDropDownLocator = By.xpath("//a[@data-menu='sort-submenu-distance']");
    By laGuardiaPickLocator = By.xpath("//a[text()='LaGuardia Airport (LGA)']");
    By checkBox5StarLocator = By.xpath("//input[@id='f-star-rating-5']");
    By checkBox4StarLocator = By.xpath("//input[@id='f-star-rating-4']");
    By checkBox3StarLocator = By.xpath("//input[@id='f-star-rating-3']");
    By checkBox2StarLocator = By.xpath("//input[@id='f-star-rating-2']");
    By checkBox1StarLocator = By.xpath("//input[@id='f-star-rating-1']");
    By elementScrollTo = By.xpath("//p[contains(text(),'All prices are per room per night unless otherwise')]");
    By messageElementToStop = By.xpath("//div[@class='info unavailable-info']");
    By starElements = By.xpath("//span[contains(@class,'star-rating-text')]");




    public void moveMouseToDestinationDropDownAndPickLaGuardia() {
        mouseHoverOverElementAndClick(distanceDropDownLocator, laGuardiaPickLocator);
    }

    public void clickCheckBox (String valueOfStar) {
        switch (valueOfStar) {
            case "5":
                clickThis(checkBox5StarLocator);
                break;
            case "4":
                clickThis(checkBox4StarLocator);
                break;
            case "3":
                clickThis(checkBox3StarLocator);
                break;
            case "2":
                clickThis(checkBox2StarLocator);
                break;
            case "1":
                clickThis(checkBox1StarLocator);
                break;
        }
    }

    public void scrollUntilEverythingLoads() throws InterruptedException {
    do{
    scrollUptoWebElement(elementScrollTo);
    scrollbyPixel(-100);
    Thread.sleep(2000);
    }
    while (findElementsUsingFluentWait(messageElementToStop).size()==0);
    }

    public boolean compareAllElements(String star) {
        List<WebElement> allElements = findElementsUsingFluentWait(starElements);
        boolean isEqual = true;
        for (WebElement element: allElements) {
            String textFromElement = element.getText();
            System.out.println(textFromElement);
            if(!textFromElement.startsWith(star)) {
                isEqual = false;
                break;
            }

        }
        return isEqual;
    }


}

