package KovalchukVlad.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

public class ContactUsPage extends BasePage {
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement searchTextEmail(){
        return findElementByXpath("//span[contains(text(), 'E-Mail')]");
    }
}
