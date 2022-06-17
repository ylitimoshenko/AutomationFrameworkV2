package DubrovskiyVlad.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

public class AboutUsPage extends BasePage {
    public AboutUsPage(WebDriver driver) {
        super(driver);
    }


    public WebElement ConnectText() {
       return findElementByXpath("//h2[contains(text(), 'Connect')]");
    }
}
