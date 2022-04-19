package NazarukBogdan.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class SearchRestaurantsPage extends BasePage {
    public SearchRestaurantsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getRestaurantsInNYC() {
        return driver.findElement(By.xpath("//h1[contains(text(), 'New York City Restaurants')]"));
    }
}
