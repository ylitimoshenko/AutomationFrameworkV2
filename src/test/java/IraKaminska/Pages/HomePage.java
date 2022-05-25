package IraKaminska.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

import java.util.ArrayList;

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

    public void goToTheSecondWindowTab(WebDriver driver, Integer seconds) {
        waitForNewTabOpened(seconds);
        ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void waitForNewTabOpened(Integer seconds) {
        for (int a = 0; a < seconds * 2; a++) {
            ArrayList<String> tabs2 = new ArrayList(driver.getWindowHandles());
            if (tabs2.size() > 1) {
                break;
            }
        }
    }
}
