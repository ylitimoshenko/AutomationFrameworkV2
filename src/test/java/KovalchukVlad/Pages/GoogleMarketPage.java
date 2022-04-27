package KovalchukVlad.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class PlayMarketPage extends BasePage {
    public PlayMarketPage(WebDriver driver) {
        super(driver);
    }

public WebElement searchAppName(){
       return findElementByXpath("//span[contains(text(), 'EatStreet: Local Food Delivery & Restaurant Pickup')]");
   }
}
