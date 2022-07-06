package TsibatyukEvhenii.Pages;

import ClasesToAll.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class RetroMagaz extends BasePage {
    public RetroMagaz(WebDriver driver) {
        super(driver);
    }
    public static String MAIN_PAGE = "https://retromagaz.com/";
    public static String LIST_UP_TITLES = "//li[@class='nav-item hover_delivery']";
    public static String XBOX_BTN = "(//*[text()='XBOX'])[1]";



    public void goToRetroMagaz(){driver.get(MAIN_PAGE);}
    public List<WebElement> getXboxBtn(){
        return  findListElementsByXpath(LIST_UP_TITLES);}
    public WebElement moveToXboxBtn(){
        return moveToWithExplicitWait(XBOX_BTN);
    }



    public List<WebElement> findListElementsByXpath(String locator) {
Actions actions = new Actions(driver);
actions.moveToElement((WebElement) driver.findElements(By.xpath(locator))).perform();
return driver.findElements(By.xpath(locator));



    }
// return waitVisibilityOfAllElementsLocatedBy(locator);
    }




