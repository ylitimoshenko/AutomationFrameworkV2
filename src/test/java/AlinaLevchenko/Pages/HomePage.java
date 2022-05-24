package AlinaLevchenko.Pages;

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
    public WebElement goToNovus() {
        return driver.findElement(By.xpath("//img[@alt='NOVUS']"));
    }

    public WebElement fruitsAndVegetablesBtn() {
        return  findElementByXpath("//span[contains(text(), 'Фрукти та овочі')]");
    }

    public List<WebElement> fruits() {
        return  findElementsByXpath("//span[@class='jsx-1455589069 CategoryCard__inner']");
    }

    public List<WebElement> selectFruits() {
        return  findElementsByXpath("//span[@data-testid='product_tile_title']");
    }

    public List<WebElement> addBtn() {
        return findElementsByXpath("//span[@class='jsx-44091497 AddButton__text']");
    }

    public WebElement deliveryTape() {
        return findElementByXpath("//li[@data-testid='deliveryType_pickup']");
    }

    public WebElement cityBtn() {
        return findElementByXpath("//div/div[@class='RegionSelect css-2b097c-container']");
    }
}
