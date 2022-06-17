package DubrovskiyVlad.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickcookieGotIt() {
        return findElementByXpath("//button[contains(text(), 'Got it')]");
    }

    public void clickBtnSingUp() {
         findElementByXpath("//a[contains(text(), 'Sign Up')]").click();
    }
}

