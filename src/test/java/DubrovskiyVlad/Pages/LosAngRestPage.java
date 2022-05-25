package DubrovskiyVlad.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class LosAngRestPage extends BasePage {

    public LosAngRestPage(WebDriver driver) {
        super(driver);
    }


    public WebElement restoransList() {
        return findElementByXpath("//h1[@class='restaurants-list_header ng-binding ng-scope']");
    }
}

