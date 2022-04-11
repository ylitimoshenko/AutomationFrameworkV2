package JuliaTymoshenko;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public WebElement enterSentence() {
        return findElementByXpath("//input[@class='gLFyf gsfi']");
    }

    public WebElement enterBtnOk() {
        return findElementByXpath("//input[@class='gNO89b']");
    }

    public List<WebElement> clickLink() {
        return findElementsByXpath("//h3[@class='LC20lb MBeuO DKV0Md']");
    }

    public WebElement pageBrovaryFacebook() {
        return findElementByXpath("//a[contains(text(), 'Говори, не говори, краще місто - Бровари:)')]");
    }


    public WebElement btnDocymenty() {
        return findElementByXpath("//span[@class='icon icon-docs-icon']");
    }

    public WebElement btnOpenGoogleDoc() {
        return findElementByXpath("//a[@class='get-google-editors js-dropdown-toggle']");
    }
}
