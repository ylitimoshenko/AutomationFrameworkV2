package AlinaLevchenko.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

import java.util.List;

public class HomePageRobo extends BasePage {
    public WebDriver driver;
    public HomePageRobo(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> selectFreelesson() {
        return BasePage.driver.findElements(By.xpath("//div[@class='tn-atom__sbs-anim-wrapper js-sbs-anim-trigger_hover']"));
    }
}

