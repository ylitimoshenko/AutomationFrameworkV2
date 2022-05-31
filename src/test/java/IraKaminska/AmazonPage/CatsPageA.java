package IraKaminska.AmazonPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class CatsPageA extends BasePage {
    public CatsPageA(WebDriver driver) {
        super(driver);
    }

    public WebElement clickCatFoodBtn() {
        return driver.findElement(By.xpath("//span[text()= 'Food']"));
    }

    public WebElement clickCatDryFoodBtn() {
        return driver.findElement(By.xpath("//span[text()= 'Dry']"));
    }

    public WebElement clickCatDryFood25_50() {
        return driver.findElement(By.xpath("//span[text() = '$25 to $50']"));
    }

    public boolean checkURLCatDryFood() {
        return driver.getCurrentUrl().contains("pets-intl-ship&bbn");
    }

    public WebElement clickCatToysBtn() {
        return driver.findElement(By.xpath("//span[text()= 'Toys']"));
    }

    public boolean checkURLCatToys() {
        return driver.getCurrentUrl().contains("pets-intl-ship&bbn");
    }
}
