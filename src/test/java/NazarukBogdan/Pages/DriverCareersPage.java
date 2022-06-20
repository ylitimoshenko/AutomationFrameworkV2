package NazarukBogdan.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

public class DriverCareersPage extends BasePage {
    public DriverCareersPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTypeFood() {
        return driver.findElement(By.xpath("//input[@id='search-autocomplete']"));
    }

    public WebElement getAdress() {
        return driver.findElement(By.xpath("//input[@id='address-input']"));
    }

    public WebElement getMoreInfo() {
        return driver.findElement(By.xpath("//h2[text()= 'More Info']"));
    }
}
