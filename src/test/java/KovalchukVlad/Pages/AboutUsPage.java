package KovalchukVlad.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class AboutUsPage extends BasePage {
    public AboutUsPage(WebDriver driver) {
        super(driver);
    }

    public void clickButtonLeadership() {
        findElementByXpath("//button[contains(text(), 'Leadership')]").click();
    }

    public WebElement searchAssertAboutUsText() {
        return findElementByXpath("//h4[contains(text(),'Matt Howard')]");
    }
}
