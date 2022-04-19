package CherniakYuriy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class HomePageES extends BasePage {
    public HomePageES(WebDriver driver) {
        super(driver);
    }

    public WebElement gotItBtn() {
        return driver.findElement(By.xpath("//button[contains(text(), 'Got it')]"));
    }

    public WebElement inputSearch() {
        return driver.findElement(By.xpath("//input[@id='input-food-search']"));
    }

    public WebElement clickEnterBtn() {
        return driver.findElement(By.xpath("//a[@id='enter-address-btn']"));
    }

    public WebElement clickGetFedBtn() {
        return driver.findElement(By.xpath("//a[@id='find-restaurants']"));
    }
}
