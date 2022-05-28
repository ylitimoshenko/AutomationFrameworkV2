package AlinaLevchenko.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

import java.util.Collection;
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

    public WebElement ultramarket() {
        return driver.findElement(By.xpath("//*[@alt='Ultramarket']"));

    }

  public List<WebElement> selectBacary() {
       return findElementsByXpath("//li[@class='jsx-2404386530 CategoriesMenuListItem']");
    }

    public List<WebElement> selectBread() {
        return findElementsByXpath("//div[@data-testid='nestedListItem']");
    }

    public WebElement bread() {
        return findElementByXpath("//h1[contains(text(),'Пекарня')]");
    }

    public List<WebElement> selectContacts() {
        return findElementsByXpath("//a[contains(text(),'Контакти')]");
    }

    public WebElement adress() {
        return driver.findElement(By.xpath("//div[contains(text(),'Адреса')]"));
    }

    public List<WebElement> contentZakazUa() {
        return findElementsByXpath("//span[@class='jsx-429672290 UaContacts__wrapIcon']");
    }
}




