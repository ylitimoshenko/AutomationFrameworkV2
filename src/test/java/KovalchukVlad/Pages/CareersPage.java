package KovalchukVlad.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class CareersPage extends BasePage {
    public CareersPage(WebDriver driver) {
        super(driver);
    }

    public WebElement searchText() {
        return findElementByXpath("//h1[contains(text(), 'Become a part of EatStreet!')]");
    }
}
