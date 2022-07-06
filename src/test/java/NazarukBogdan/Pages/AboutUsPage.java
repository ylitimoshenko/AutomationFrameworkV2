package NazarukBogdan.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

public class AboutUsPage extends BasePage {
    public AboutUsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAboutUsInfo() {
        return driver.findElement(By.xpath("//h1[text()= 'About Us']"));
    }

    public WebElement getTypeFood() {
        return driver.findElement(By.xpath("//input[@id='search-autocomplete']"));
    }

    public WebElement getAdress() {
        return driver.findElement(By.xpath("//input[@id='address-input']"));
    }
}
