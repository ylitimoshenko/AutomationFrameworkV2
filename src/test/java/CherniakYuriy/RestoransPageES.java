package CherniakYuriy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

public class RestoransPageES extends BasePage {
    public RestoransPageES(WebDriver driver) {
        super(driver);
    }

    public WebElement openNowBtn() {
        return driver.findElement(By.xpath("//label[contains(text(), 'Open Now')]"));
    }

    public WebElement checkResult() {
        return driver.findElement(By.xpath("//p[contains(text(), 'No available restaurants')]"));
    }
}
