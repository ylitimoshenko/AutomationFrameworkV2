package KulykYuliya.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void OpenSiteEatStrt() {
        driver.get("https://qa2.eatstreet.com/");
    }

    public WebElement clickBtnSingIn() {
        return findElementByXpath("//a[@id='menu-signin']");

//        public void OpenSiteEatStreet () {
//            driver.get("https://qa2.eatstreet.com/");
//        }
//
//        public WebElement closeBtnGotIt () {
//            return findElementByXpath("//button[contains(text(), 'Got it')]");
//        }
//
//        public WebElement getBtnSingIn () {
//            return findElementByXpath("//a[@id='menu-signin']");
//        }
//
//        public WebElement IncorrectDataToLogIn () {
//            return findElementByXpath("//span[@ng-if='signinCtrl.loginInvalid']");
//
//        }
 }
    }
