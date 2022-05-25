package KovalchukVlad.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class ForCustomersPage extends BasePage {

    public ForCustomersPage(WebDriver driver) {
        super(driver);
    }

    public WebElement searchTextYouHungry(){
       return findElementByXpath("//span[@class='uiOutputText']");
    }
}
