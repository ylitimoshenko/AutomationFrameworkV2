package KovalchukVlad.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class AppStorePage extends BasePage {
    public AppStorePage(WebDriver driver) {
        super(driver);
    }

    public WebElement searchAppName(){
        return findElementByXpath("//h1[@class='product-header__title app-header__title']");
    }
}
