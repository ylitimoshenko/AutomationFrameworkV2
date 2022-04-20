package IraKaminska;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getGotItBtn() {
        return findElementByXpath("//button[text()= 'Got it']");
    }

    public WebElement getCheckboxTakeout() {
        return findElementByXpath("//label[@for='home-checkbox-takeout']");
    }

    public WebElement getInputFoodSearch() {
        return findElementByXpath("//input[@id='input-food-search']");
    }

    public WebElement getCalifornia() {
        return findElementByXpath("//li[@val='California, USA']");
    }

    public WebElement checkList() {
        return findElementByXpath("//p[text()= '2 matching restaurants near you']");
    }
}
