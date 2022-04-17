package KulykYuliya.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class EnterPage extends BasePage {
    public EnterPage(WebDriver driver) {
        super(driver);
    }

    public WebElement choiseRestaurants() {
        return findElementByXpath("//a[contains(text(), 'Munch A Lunch')]");

    }

    public WebElement clickBtnGotIt() {
        return findElementByXpath("//button[contains(text(), 'Got it')]");
    }
}
