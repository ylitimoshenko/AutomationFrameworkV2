package IraKaminska.AmazonPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class PetSuppliesPage extends BasePage {
    public PetSuppliesPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkURLAdressPetSupplies() {
        return driver.getCurrentUrl().contains("pets-intl-ship");
    }

    public WebElement clickDogsBtn() {
        return driver.findElement(By.xpath("//span[text()= 'Dogs']"));
    }

    public WebElement cklickDogsFoodBtn() {
        return driver.findElement(By.xpath("//span[text()= 'Food']"));
    }

    public WebElement clickDryDogsFood() {
        return driver.findElement(By.xpath("//span[text()= 'Dry']"));
    }

    public WebElement clickDryDogsFoodGlutenFree() {
        return driver.findElement(By.xpath("//span[text()= 'Gluten-Free']"));
    }

    public WebElement clickCatsBtn() {
        return driver.findElement(By.xpath("//span[text()= 'Cats']"));
    }

    public WebElement clickBedsFurniture() {
        return driver.findElement(By.xpath("//span[text()= 'Beds & Furniture']"));
    }

    public WebElement clickBedsFurnitureUpTo25() {
        return driver.findElement(By.xpath("//span[text()= 'Up to $25']"));
    }
}
