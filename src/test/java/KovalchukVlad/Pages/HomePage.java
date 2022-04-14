package KovalchukVlad.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickButtonSingIn() {
        return findElementByXpath("//a[@id='menu-signin']");
    }

    ;

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

    public WebElement clickButtonSingUp() {
        return findElementByXpath("//a[contains(text(), 'Sign Up')]");
    }

    public int inputEmailSingUp() {
        findElementByXpath("//input[@id='email']").sendKeys(System.currentTimeMillis() + "vlad@gmail.com");
        return 0;
    }

    public int inputPassSingUpFirst() {
        findElementByXpath("//input[@id='password']").sendKeys("Vlad2201@yy");
        return 0;
    }

    public int inputPassSingUpSecond() {
        findElementByXpath("//input[@id='passwordAgain']").sendKeys("Vlad2201@yy");
        return 0;
    }

    public WebElement clickButtonSingUpReg() {
        return findElementByXpath("//button[@id='signup']");
    }

    public WebElement CheckMyProfile() {
        return findElementByXpath("//a[contains(text(),'My Account')]");
    }
}
