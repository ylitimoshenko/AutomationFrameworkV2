package DubrovskiyVlad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickButtonSignIn() {
        return findElementByXpath("//a[@id='menu-signin']");
    }

    public WebElement clickGoiItcookie() {
        return findElementByXpath("//button[contains(text(), 'Got it')]");
    }

    public WebElement clickEmailWrite() {
        return findElementByXpath("//input[@id='email']");
    }

    public WebElement GetPasswordandWrite() {
        return findElementByXpath("//input[@id='password']");
    }

    public WebElement GetSingInclick() {
        return driver.findElement(By.xpath("//button[@id='signin']"));
    }

    public WebElement inCorrectLogin() {
        return findElementByXpath("//span[contains(text(), 'The login information you entered is incorrect.')]");
    }

    public WebElement getAddressField() {
        return driver.findElement(By.xpath("//input[@id='input-food-search']"));
    }

    public WebElement getFedBtn() {
        return driver.findElement(By.xpath("//a[@id='find-restaurants']"));
    }

    public WebElement checkAndClosePopUpWindow() {
        return driver.findElement(By.xpath("//a[@id='enter-address-btn']"));
    }
}
