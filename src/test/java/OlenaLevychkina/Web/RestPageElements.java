package OlenaLevychkina.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class RestPageElements extends BasePage {

    public RestPageElements(WebDriver driver) {
        super(driver);
    }

    public void searchNameInput() {
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("New York");
    }

    public WebElement searchGetFed() {
        return driver.findElement(By.xpath("//a[@id='find-restaurants']"));
    }

    public void searchRestNameInput() {
        driver.findElement(By.xpath("//a[@id='find-restaurants']")).sendKeys("Modern Slice");
    }

    public WebElement searchAttempt() {
        return driver.findElement(By.xpath("//a[@id='enter-address-btn']"));
    }

    public WebElement searchAppetizers() {
        driver.findElement(By.xpath("//input[@placeholder='Search Menu']")).sendKeys("Fried Calamari");
        return null;
    }

    public WebElement searchOmelettes() {
        return driver.findElement(By.xpath("//h2[contains(text(), 'Omelettes')]"));
    }

    public WebElement CheckSearchMenu() {
        return driver.findElement(By.xpath("//span[contains(text(), 'Bel Air Omelette')]"));
    }
}

