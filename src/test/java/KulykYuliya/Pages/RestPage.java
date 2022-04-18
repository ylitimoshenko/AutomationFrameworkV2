package KulykYuliya.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class RestPage extends BasePage {
    public RestPage(WebDriver driver) {
        super(driver);
    }

    public WebElement findDesserts() {
        return findElementByXpath("//h2[contains(text(), 'Dessert')]");
    }

    public WebElement CheckRest() {
        return findElementByXpath("//span[contains(text(), 'Chocolate Cake')]");
    }
}
