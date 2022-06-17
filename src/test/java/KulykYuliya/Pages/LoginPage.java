package KulykYuliya.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement enterEmailInField() {
        return findElementByXpath("//input[@id='email']");
    }

    public WebElement enterPassInField() {
        return findElementByXpath("//input[@id='password']");
    }

    public WebElement getBtnSingIn() {
        return findElementByXpath("//button[contains(text(), 'Sign In')]");
    }

    public void emailData() {
        findElementByXpath("'//button[contains(text(), 'Sign In')]'").sendKeys("kulykyuliya@gmail.com");
    }

    public WebElement clickSingIn() {
        return findElementByXpath("//a[@id='menu-signin']");

    }

    public void enterPersonalEmail() {
        findElementByXpath("//input[@id='email']").sendKeys("kulykyuliya@gmail.com");
    }

    public void enterPersonalPassword() {
        findElementByXpath("//input[@id='password']").sendKeys("uehuflf66");
    }

    public WebElement checkBtnSingIn() {
        return findElementByXpath("//button[contains(text(), 'Sign In')]");
    }

    public WebElement chickBtbGotIt() {
        return findElementByXpath("//button[contains(text(), 'Got it')]");
    }

    public WebElement checkSing() {
        return findElementByXpath("//span[contains(text(), 'The')]");
    }
}
