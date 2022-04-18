package KovalchukVlad.Pages;

import org.openqa.selenium.WebDriver;
import pageobject.BasePage;

public class AboutUsPage extends BasePage {


    public AboutUsPage(WebDriver driver) {
        super(driver);
    }


    public boolean containsAboutUsInfo() {
        findElementByXpath("//p[contains(text(), 'Founded in 2010')]").isDisplayed();
        return false;
    }
}
