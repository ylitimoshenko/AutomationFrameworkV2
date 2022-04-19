package KulykYuliya.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class TakeOutPage extends BasePage {
    public TakeOutPage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickBtnTakeOut() {
        return findElementByXpath("//label[contains(text(), 'Takeout')]");

    }

    public WebElement checkTakeOut() {
        return findElementByXpath("//div[contains(text(), 'Use')]");
    }
}
