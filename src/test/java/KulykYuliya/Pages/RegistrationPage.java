package KulykYuliya.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickSinfInWithGoogle() {
        return findElementByXpath("//div[@id='uniqueid']");
        }

    }
