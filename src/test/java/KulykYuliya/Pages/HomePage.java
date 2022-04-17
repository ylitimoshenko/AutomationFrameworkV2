package KulykYuliya.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void OpenSiteEatStrt() {
        driver.get("https://qa2.eatstreet.com/");
    }

    public WebElement clickBtnSingIn() {
        return findElementByXpath("//a[@id='menu-signin']");

    }
}
