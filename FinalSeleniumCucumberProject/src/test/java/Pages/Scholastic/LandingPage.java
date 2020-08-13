package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class LandingPage extends BasePage {

    By signinLocator = By.xpath("//a[@class='signin']");
    By usernameLocator = By.xpath("(//input[@id='dwfrm_login_username'])[2]");
    By passwordLocator = By.xpath("(//input[@id='dwfrm_login_password'])[2]");
    By signinButtonLocator = By.xpath("//button[contains(@class,'sign-in-mod')]");
    By notificationLocator = By.xpath("//span[@class='notification-close']");



    public void clickSignin() {
        clickThis(signinLocator);
        type(usernameLocator, "mmm@yahoo.com");
        type(passwordLocator, "Career2020");
        clickThis(signinButtonLocator);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(notificationLocator);
    }

}
