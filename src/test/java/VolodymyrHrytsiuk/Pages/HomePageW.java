package VolodymyrHrytsiuk.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

public class HomePageW extends BasePage {
    public HomePageW(WebDriver driver) {
        super(driver);
    }

    public WebElement checkWarcraftIII() {
        return driver.findElement(By.xpath("//a//img[@alt='Warcraft III']"));
    }

    public WebElement wrctReforgedIcon() {
        return driver.findElement(By.xpath("//img[contains(@slot,'cover') and not(contains(@src, 'WoW_Gear'))]"));
    }

    public WebElement buyNowReforgedIIIButton() {
        return driver.findElement(By.xpath("//a[@id='browsing.product-page.button.buy']"));
    }
}
