package AlinaLevchenko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement price() {
        return driver.findElements(By.xpath("//li[@class='dropdown']")).get(8);
    }

    public List<WebElement> designInteriorPriceBtn() {
        return driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
    }

    public List<WebElement> imgPriceOpen() {
        return driver.findElements(By.xpath("//a[@href='/ua/design-interior-price-kiev-ukr.html']"));
    }
}
