package KovalchukVlad.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void OpenSiteEatStreet(){
        driver.get("https://eatstreet.com/");
    }

    public WebElement getButtonSingIn() {
        return findElementByXpath("//a[@id='menu-signin']");
    }

    public LoginPage clickSignInBtn(){
        getButtonSingIn().click();
        return new LoginPage(driver);
    }

    public WebElement clickShoesButton() {
        return findElementByXpath("//span[contains(text(), 'Взуття')]");
    }

    public WebElement clickButtonGotIt() {
        return findElementByXpath("//button[contains(text(), 'Got it')]");
    }




    public WebElement IncorrectDataToLogIn() {
        return findElementByXpath("//span[contains(text(), 'incorrect')]");
    }


    public WebElement CheckMyProfile() {
        return findElementByXpath("//a[contains(text(),'My Account')]");
    }
}
