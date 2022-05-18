package VolodymyrHrytsiuk.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public WebElement checkWorldOfWarcraftGame() {
        return driver.findElement(By.xpath("//a[@title='World of Warcraft']"));
    }

    public WebElement checkWorldOfWarcraftClassicGame() {
        return driver.findElement(By.xpath("//a[@title='World of Warcraft Classic']"));
    }

    public WebElement checkHearthstoneGame() {
        return driver.findElement(By.xpath("//a[@title='Hearthstone']"));
    }

    public WebElement checkOverwatchGame() {
        return driver.findElement(By.xpath("//a[@title='Overwatch']"));
    }

    public WebElement checkDiabloImmortalGame() {
        return driver.findElement(By.xpath("//a[@title='Diablo Immortal']"));
    }

    public WebElement checkDiabloIIResurrectedGame() {
        return driver.findElement(By.xpath("//a[@title='Diablo II: Resurrected']"));
    }

    public WebElement checkDiabloIIIGame() {
        return driver.findElement(By.xpath("//a[@title='Diablo III']"));
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
