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

    public WebElement getTakeOutBtn() {
        return driver.findElement(By.xpath("//input[@id='filters-checkbox-takeout']"));
    }

    public WebElement getNoResstaurants() {
        return driver.findElement(By.xpath("//p[text()= 'No available restaurants']"));
    }

    public WebElement getCakeNYC() {
        return driver.findElement(By.xpath("//h1[contains(text(), 'New York City Restaurants')]"));
    }

    public WebElement getDessertCategory() {
        return driver.findElement(By.xpath("//label[contains(text(), 'Dessert ')]"));
    }
}
