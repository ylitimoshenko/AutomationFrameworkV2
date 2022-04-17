package KulykYuliya.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class LogOn extends BasePage {
    public LogOn(WebDriver driver) {
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
}
