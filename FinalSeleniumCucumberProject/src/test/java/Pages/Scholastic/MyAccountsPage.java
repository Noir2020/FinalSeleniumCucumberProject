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
}
