package KovalchukVlad.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
  
     public void openSiteEatStreet(){
       driver.get("https://eatstreet.com/");
    }

    public WebElement getButtonSingIn() {
        return findElementByXpath("//a[@id='menu-signin']");
    }

    public WebElement clickShoesButton() {
        return findElementByXpath("//span[contains(text(), 'Взуття')]");
    }

    public void clickButtonGotIt() {
        findElementByXpath("//button[contains(text(), 'Got it')]").click();
    }




    public WebElement IncorrectDataToLogIn() {
        return findElementByXpath("//span[contains(text(), 'incorrect')]");
    }


    public WebElement CheckMyProfile() {
        return findElementByXpath("//a[contains(text(),'My Account')]");
    }

    public void goToHomePage(){
        findElementByXpath("//img[@class='logo-alternate']").click();
    }

    public void clickButtonAboutUs(){
        findElementByXpath("//a[contains(text(), 'About Us')]").click();
    }

    public void clickButtonContactUs() {
        findElementByXpath("//a[contains(text(), 'Contact Us')]").click();
    }
    public void clickButtonForCustomers(){
        findElementByXpath("//a[contains(text(), 'For Customers')]").click();
    }

    public void clickButtonApi() {
        findElementByXpath("//a[contains(text(), 'API')]").click();
    }

    public void clickButtonCareers() {
        findElementByXpath("//a[contains(text(), 'Careers')]").click();
    }
}
