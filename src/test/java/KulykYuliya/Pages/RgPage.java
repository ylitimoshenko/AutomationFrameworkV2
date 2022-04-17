package KulykYuliya.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class RgPage extends BasePage {
    public RgPage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickSinfInWithGoogle() {
        return findElementByXpath("//div[@id='uniqueid']");
        }

    }
