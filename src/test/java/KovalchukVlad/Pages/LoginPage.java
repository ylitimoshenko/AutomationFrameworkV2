package KovalchukVlad.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickButtonSingUp() {
        return findElementByXpath("//a[contains(text(), 'Sign Up')]");
    }

    public WebElement getEmailInputField() {
        return findElementByXpath("//input[@id='email']");
    }

    public WebElement getPasswordInputField() {
        return findElementByXpath("//input[@id='password']");
    }

    public WebElement getButtonSingIn() {
        return findElementByXpath("//button[@id='signin']");
    }

    public void clickButtonGotItCookies() {
        findElementByXpath("//button[contains(text(), 'Got it')]").click();
    }
}
