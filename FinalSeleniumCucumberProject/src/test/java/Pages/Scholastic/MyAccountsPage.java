package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class MyAccountsPage extends BasePage {

    By accountLocator = By.xpath("//a[@class='user-account toggle-item']//span[@class='fa-arrowdown']");
    By profileLocator = By.xpath("//a[@class='null'][contains(text(),'Profile')]");
    By editLocator = By.xpath("//div[@class='name-section']//a[@class='reading-club'][contains(text(),'Edit')]");
    By lastNameLocator = By.xpath("//input[@id='dwfrm_profile_customer_lastname']");
    By saveLocator = By.xpath("//form[@id='RegistrationForm']//button[@class='button-continue'][contains(text(),'Save')]");
    By headerName = By.xpath("//span[@class='user-data']");
    By accountName = By.xpath("//div[@class='name-section']//div[1]//span[1]");


    By orderLocator = By.xpath("//div[@class='hide-mobile desktop_nav_menu']//a[@id='enter-orders']");
    By ytoLocator = By.xpath("//div[@class='hide-mobile desktop_nav_menu']//a[contains(text(),'Your Teacher Order')]");
    By quantityLocator = By.xpath("(//input[@class='itm-qty-usd input-qty numericenteronly'])[1]");
    By jumperLocator = By.xpath("//div[@id='info-student-flyer-order-fee']");
    By bonusLocator = By.xpath("(//input[@class='itm-qty-pts input-qty numericenteronly'])[1]");
    By flyerLocator = By.xpath("//ul[@class='hidden-xs']//span[contains(text(),'By Flyer')]");
    By quantityLocator1 = By.xpath("(//input[@class='itm-qty-usd input-qty numericenteronly'])[2]");



    public void clickAccountProfile() {
        clickThis(accountLocator);
        clickThis(profileLocator);
    }

    public void clickEditLastName(String name) {
        clickThis(editLocator);
        clearField(lastNameLocator);
        type(lastNameLocator, name);
        clickThis(saveLocator);
    }

    public boolean getTextHeaderName(String name) {
        boolean isEqual = getTextFromElement(headerName).contains(name);
        return isEqual;
    }

    public boolean getTextAccountName(String name) {
        boolean isEqual = getTextFromElement(accountName).contains(name);
        return isEqual;
    }

    public void clickYTO() {
        mouseHoverOverElementAndClick(orderLocator, ytoLocator);
    }

    public void clickQuantity() {
        clickThis(quantityLocator);
    }

    public boolean jumperDisplayed() {
        boolean isDisplayed = findElementUsingFluentWait(jumperLocator).isDisplayed();
        return isDisplayed;
    }

    public void clickBonus() {
        clickThis(bonusLocator);
    }

    public void selectFlyer() {
        if (findElementUsingFluentWait(flyerLocator).isEnabled()) {
            clickThis(flyerLocator);
        }
    }

    public void clickQuantity1() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(quantityLocator1);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
