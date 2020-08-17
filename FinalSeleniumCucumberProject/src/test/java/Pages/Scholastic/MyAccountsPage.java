package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

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


    By addCreditCardLocator = By.xpath("//a[@class='reading-club add-creditcardtoaccount']");
    By cardNumberBoxLocator = By.xpath("//input[contains(@id, 'dwfrm_paymentinstruments_creditcards_newcreditcard_number')]");
    By expirationMonthDropDown = By.xpath("//div[contains(text(),'Month')]");
    By expirationDatesMonthLocator = By.xpath("//div[@id='scrollbar-1']//ancestor::li[@class='custom-option select-option']");
    By expirationYearDropDown = By.xpath("//div[contains(text(),'Year')]");
    By expirationDateYearLocator = By.xpath("//div[@id='scrollbar-2']//ancestor::li[@class='custom-option select-option']");
    By securityCodeLocator = By.xpath("//input[@id='dwfrm_paymentinstruments_creditcards_newcreditcard_cvn']");
    By firstNameBoxLocator = By.xpath("//input[@id='dwfrm_paymentinstruments_creditcards_address_firstname']");
    By lastNameLocator1 = By.xpath("//input[@id='dwfrm_paymentinstruments_creditcards_address_lastname']");
    By addressBoxLocator = By.xpath("//input[@id='dwfrm_paymentinstruments_creditcards_address_address1']");
    By zipCodeBoxLocator = By.xpath("//input[@id='dwfrm_paymentinstruments_creditcards_address_postal']");
    By cityDropdownLocator = By.xpath("//div[@class='selected-option input-select no-mouseflow required selected-active']");
    By brickTown = By.xpath("//div[@id='scrollbar-4']//ancestor::li[@class='custom-option select-option last']");
    By phoneNumberLocator = By.xpath("//input[@id='dwfrm_paymentinstruments_creditcards_address_phone']");
    By saveButtonLocator = By.xpath("//button[@class='button-continue']");
    By allCardsInMyAccount = By.xpath("//div[@class='block cardlength']//ancestor::span[@class='bold']");


    By reviewCartLocator = By.xpath("//button[@class='secondary']");
    By proceedToCheckOutLocator = By.xpath("//button[@id='dwfrm_cart_checkoutCart']");
    By proceedToCheckOut2Locator = By.xpath("//div[@class='modal-content-TCI']//button[@name='dwfrm_cart_checkoutCart'][contains(text(),'Proceed to Checkout')]");
    By continueToCheckOut = By.xpath("//button[@id='btn-continue-checkout']//span[contains(text(),'Continue Checkout')]");
    By selectPaymentDropdown = By.xpath("//div[@class='selected-option']");
    By creditCardLocator = By.xpath("//li[@class='custom-option CREDIT_CARD']//span[contains(text(),'Credit Card')]");
    By cardTypeDropdown = By.xpath("//div[@class='custom-select credit']");
    By cardTypeOption = By.xpath("//li[@class='custom-option ']");

    By typeBoxLocator = By.xpath("//input[@class='custom-placeholder valid']");
    By searchBoxLocator = By.xpath("//i[@class='fa fa-search']");
    By starLocator = By.xpath("(//i[@class='icon-a fa-tcool-star tooltipstered'])[1]");
    By starActiveLocator = By.xpath("(//i[@class='icon-a fa-tcool-star tooltipstered active'])[1]");



    By myListsDropdown = By.xpath("//span[contains(text(),'My Lists')]");
    By recommendListLocator = By.xpath("//li[@class='recommend']//a[1]");
    By bookTitleLocator = By.xpath("//div[@class='product-list-item']");



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




    public void clickReviewCart() {
        clickThis(reviewCartLocator);
    }
    public void clickProceed() {
        clickThis(proceedToCheckOutLocator);
    }
    public void clickProceed2() {
        clickThis(proceedToCheckOut2Locator);
    }
    public void clickContinueCheckOut() {
        clickThis(continueToCheckOut);
    }
    public void choosePaymentMethod() {
        System.out.println(getTextFromElement(selectPaymentDropdown));
        sleep(3000);
        clickThis(selectPaymentDropdown);
        sleep(5000);
        clickThis(creditCardLocator);
    }
    public boolean verifyCard(String number) {
        boolean isPresent = false;
        sleep(2000);
        clickThis(cardTypeDropdown);
        sleep(2000);
        List<WebElement> allCards = findElementsUsingFluentWait(cardTypeOption);
        for(WebElement card: allCards) {
            if(card.getText().endsWith(number)) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }




    public void clickYTO() {
        mouseHoverOverElementAndClick(orderLocator, ytoLocator);
    }

    public void clickQuantity() {
        clickThis(quantityLocator);
    }
    public void typeQuantity(String quantity) {
        type(quantityLocator, quantity);
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

    public void addCreditCard(String number) {
        clickThis(addCreditCardLocator);
        sleep(3000);
        type(cardNumberBoxLocator, number);
        dropDownByClick(expirationMonthDropDown, expirationDatesMonthLocator, "05");
        dropDownByClick(expirationYearDropDown, expirationDateYearLocator, "2023");
        type(securityCodeLocator, "888");
        type(firstNameBoxLocator, "Mariya");
        type(lastNameLocator1, "Happy");
        type(addressBoxLocator, "New Jersey");
        type(zipCodeBoxLocator, "08724");
        clickThis(cityDropdownLocator);
        clickThis(brickTown);
        sleep(3000);
        type(phoneNumberLocator, "7322236006");
        sleep(4000);
        clickThis(saveButtonLocator);


    }

    public boolean verifyCardNumber(String number) {
        boolean isContaining = false;
        List<WebElement> cardNumbers = findElementsUsingFluentWait(allCardsInMyAccount);
        for(WebElement cardNumber: cardNumbers) {
            if(cardNumber.getText().equals(number)) {
                isContaining = true;
                break;
            }
        }
        return isContaining;
    }




    public void typeAndSearch(String bookName) {
        type(typeBoxLocator, bookName);
        clickThis(searchBoxLocator);
    }

    public void clickStar() {
        clickThis(starLocator);
    }

    public boolean starActive() {
        boolean isStarActive = findElementUsingFluentWait(starActiveLocator).isDisplayed();
        return isStarActive;
    }

    public boolean verifyIfContainsItems() {
        clickThis(myListsDropdown);
        boolean isContainingItems = getTextFromElement(recommendListLocator).contains("1 item");
        return isContainingItems;
    }

    public boolean verifyItemInRecommendList() {
        clickThis(recommendListLocator);
        boolean isContainingTitle = getTextFromElement(bookTitleLocator).contains("Harry");
        return isContainingTitle;
    }


}
