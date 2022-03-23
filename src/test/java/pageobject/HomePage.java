package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public WebElement enterSentence() {
        return findElementByXpath("//input[@class='gLFyf gsfi']");
    }

    public WebElement enterBtnOk() {
        return findElementByXpath("//input[@class='gNO89b']");
    }

    public List<WebElement> clickLinkBrovary() {
        return findElementsByXpath("//h3[@class='LC20lb MBeuO DKV0Md']");
    }

    public WebElement pageBrovaryFacebook() {
        return findElementByXpath("//a[contains(text(), 'Говори, не говори, краще місто - Бровари:)')]");
    }
}
