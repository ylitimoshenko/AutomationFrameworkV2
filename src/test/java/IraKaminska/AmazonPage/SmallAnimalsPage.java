package IraKaminska.AmazonPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class SmallAnimalsPage extends BasePage {
    public SmallAnimalsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickFoodForSmallAnimals() {
        return driver.findElement(By.xpath("//span[text()= 'Food']"));
    }

    public WebElement clickFoodForSmallAnimalsUpTo25() {
        return driver.findElement(By.xpath("//span[text()= 'Up to $25']"));
    }

    public boolean checkURLFoodForSmallAnimals() {
        return driver.getCurrentUrl().contains("&dc&qid");
    }
}
