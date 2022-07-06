package KulykYuliya.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

public class HomePage extends BasePage {


    public WebElement checkBtnGetFed() {
        return findElementByXpath("//div[contains(text(), 'Tell')]");
    }

    ;

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

//        public WebElement getBtnSingIn () {
//            return findElementByXpath("//a[@id='menu-signin']");
//        }

//        public WebElement IncorrectDataToLogIn () {
//            return findElementByXpath("//span[@ng-if='signinCtrl.loginInvalid']");
//
////        }
    }

    public WebElement closeBtnGoIt() {
        return findElementByXpath("//button[contains(text(), 'Got it')]");
    }

    public WebElement IncorrectDataToLogIn() {
        return findElementByXpath("//span[@ng-if='signinCtrl.loginInvalid']");

    }

    public void enterAdress() {
        findElementByXpath("//input[@id='input-food-search']").sendKeys("2021 North Kinney Road");
    }

    public WebElement clickFed() {
        return findElementByXpath("//a[contains(text(), 'Get Fed')]");
    }

    public WebElement clickBtnGetFed() {
        return findElementByXpath("//a[@id='find-restaurants']");
    }

    public WebElement clickBtnDelivery() {
        return findElementByXpath("//label[contains(text(), 'Delivery')]");
    }

    public WebElement checkBtnDelivery() {
        return findElementByXpath("//div[contains(text(), 'We')]");
    }

    public void enterNewYork() {
        findElementByXpath("//input[@id='input-food-search']").sendKeys("New York");
    }

    public WebElement checkEnterNY() {
        return findElementByXpath("//li[contains(text(), 'New York, NY, USA')]");
    }
}


