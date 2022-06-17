package DubrovskiyVlad.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

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

    public void openSiteEatstreet() {
        driver.get("https://eatstreet.com/");
    }

    public WebElement getBtnSingIn() {
        return findElementByXpath("//a[@id='menu-signin']");
    }

    public WebElement CheckMyProfile() {
        return findElementByXpath("//a[contains(text(), 'My Account')]");

    }

    public void clickTakeOut() {
        findElementByXpath("//label[contains(text(), 'Takeout')]").click();
    }

    public void writeYouAdress() {
        findElementByXpath("//input[@id='input-food-search']").sendKeys("Los Angeles, Калифорния, США");
    }

    public void GetFedClick() {
        findElementByXpath("//a[@id='find-restaurants']").click();
    }

    public void closeLocation() {
        findElementByXpath("//a[@id='enter-address-btn']").click();
    }

    public void clickButtonApi() {
        findElementByXpath("//a[contains(text(), 'API')]").click();
    }

    public void clickPartnerWithUs() {
        findElementByXpath("//a[contains(text(), 'Partner with us')]").click();
    }

    public WebElement CheckPartnerwithUs() {
        return findElementByXpath("//h1[contains(text(), 'EatStreet is the Smartest Way to Order Food Online')]");

    }

    public void clickContctUs() {
        findElementByXpath("//a[contains(text(), 'Contact Us')]").click();
    }

    public void clickBtnBlog() {
        findElementByXpath("//a[contains(text(), 'Blog')]").click();
    }

    public void clickBtnAboutUs() {
        findElementByXpath("//a[contains(text(), 'About Us')]").click();
    }

    public void clickPrivatyPolicy() {
        findElementByXpath("//a[contains(text(), 'Privacy Policy')]").click();
    }
}


