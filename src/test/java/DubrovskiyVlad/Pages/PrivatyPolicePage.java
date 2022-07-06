package DubrovskiyVlad.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

public class PrivatyPolicePage extends BasePage {
    public PrivatyPolicePage(WebDriver driver) {
        super(driver);
    }


    public WebElement textContactsUs() {
       return findElementByXpath("//b[contains(text(), 'Contact Us')]");

    }
}
