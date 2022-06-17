package KulykYuliya.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

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

    public WebElement checkEnterAddress() {
        return findElementByXpath("//h1[contains(text(), 'Tucson')]");
    }
}
