package AlinaLevchenko.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

import java.util.List;

public class RozetkaHomePage extends BasePage {
    public RozetkaHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement findElementByXpath(String locator) {
        return waitElementToBeClickable(locator);
    }

    public List<WebElement> munuCategories() {
        return driver.findElements(By.xpath("//a[@class='menu-categories__link']"));
    }

    public List<WebElement> selectLaptop() {
        return driver.findElements(By.xpath("//a[contains(text(),'Ноутбуки')]"));
    }

    public List<WebElement> selectLaptopAcerAspire() {
        return driver.findElements(By.xpath("//span[@class='goods-tile__title']"));
    }

    public WebElement putInBasket() {
        return driver.findElement(By.xpath("//span[contains(text(),' Купить ')]"));
    }

    public WebElement placeOnOrder() {
        return driver.findElement(By.xpath("//a[contains(text(),'Оформить заказ ')]"));
    }

    public WebElement ordering() {
        return driver.findElement(By.xpath(" //h1[contains(text(),'Оформление заказа ')]"));
    }
}
