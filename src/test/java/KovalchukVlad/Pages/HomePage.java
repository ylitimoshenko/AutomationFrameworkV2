package KovalchukVlad.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickButtonSingIn(){
        return findElementByXpath("//a[@id='menu-signin']");
    };

    public WebElement clickShoesButton() {
        return findElementByXpath("//span[contains(text(), 'Взуття')]");
    }

    public WebElement clickButtonGotIt() {
        return findElementByXpath("//button[contains(text(), 'Got it')]");
    }


    public WebElement GetEmailAndWrite() {
        return findElementByXpath("//input[@id='email']");
    }

    public WebElement GetPasswordAndWrite() {
        return findElementByXpath("//input[@id='password']");
    }

    public WebElement ClickButtonSingIn() {
        return findElementByXpath("//button[@id='signin']");
    }

    public WebElement IncorrectDataToLogIn() {
        return findElementByXpath("//span[contains(text(), 'incorrect')]");
    }
}
