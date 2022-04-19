package OlenaLevychkina.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RestPageHelper extends RestPageElements {

    public RestPageHelper(WebDriver driver) {
        super(driver);
    }
    public WebElement clickBtnGotIt() {return driver.findElement(By.xpath("//button[contains(text(), 'Got it')]"));
    }

    public WebElement searchRestaurants() {return driver.findElement(By.xpath("//a[contains(text(), 'Happy Times Cafe')]"));
    }
}
