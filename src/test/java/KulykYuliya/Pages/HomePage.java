package KulykYuliya.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void OpenSiteEatStreet() {
        driver.get("https://qa2.eatstreet.com/");
    }

    public void enterAddress() {
        findElementByXpath("//input[@id='input-food-search']").sendKeys("5000 South Arizona Mills Circle");

    }

    public WebElement clichFed() {
        return findElementByXpath("//a[@id='find-restaurants']");
    }


    public WebElement clickEnterAddress() {
        return findElementByXpath("//a[@id='enter-address-btn']");

    }


    public WebElement arizona() {
        return findElementByXpath("//li[contains(text(), 'Arizona Mills, South Arizona Mills Circle, Tempe, AZ, USA')]");
    }
}
