package DubrovskiyVlad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public WebElement clickBlog() {
        return driver.findElement(By.xpath(""));
    }
}
