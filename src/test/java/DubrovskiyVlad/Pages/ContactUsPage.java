package DubrovskiyVlad.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class ContactUsPage extends BasePage {
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement CheckContactUs() {
        return findElementByXpath("//div[contains(text(), 'Contact Us')]");
    }
}
