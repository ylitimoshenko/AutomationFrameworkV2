package IraKaminska.AmazonPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

public class BirdsPageA extends BasePage {
    public BirdsPageA(WebDriver driver) {
        super(driver);
    }

    public WebElement clickTreatsBtn() {
        return driver.findElement(By.xpath("//span[text()= 'Treats']"));
    }

    public WebElement clickBrandHari() {
        return driver.findElement(By.xpath("//span[text()= 'Hari']"));
    }

    public boolean checkURLBirds() {
        return driver.getCurrentUrl().contains("pets-intl-ship&bbn");
    }
}
