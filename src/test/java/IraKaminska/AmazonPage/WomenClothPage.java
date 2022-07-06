package IraKaminska.AmazonPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

public class WomenClothPage extends BasePage {
    public WomenClothPage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickCasualDressesBtn() {
        return driver.findElement(By.xpath("//span[contains(text(), 'Casual Dresses')]"));
    }

    public WebElement clickPremiumBrandsBtn() {
        return driver.findElement(By.xpath("//span[contains(text(), 'Premium Brands')]"));
    }

    public boolean checkURLAdress() {
        return driver.getCurrentUrl().contains("dresses+for+women");
    }
}
