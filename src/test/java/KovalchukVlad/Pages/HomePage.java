package KovalchukVlad.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public WebElement clickShoesButton(){
        return findElementByXpath("//span[contains(text(), 'Взуття')]");
    };

//    public List<WebElement> clickShoesAdidas() {
//        return findElementsByXpath("//a[contains(text(), 'Adidas')]").get(0);
//    }


}
