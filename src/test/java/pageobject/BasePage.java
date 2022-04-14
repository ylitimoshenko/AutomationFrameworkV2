package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class BasePage {

    int BASIC_TIME = 15;

    public List<WebElement> waitVisibilityOfAllElementsLocatedBy(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
    }

    public WebElement waitElementToBeClickable(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }
    public static WebDriver driver;

    public  BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement findElementByXpath(String locator) {
        return waitElementToBeClickable(locator);
    }
//    public WebElement findElement(String locator){ return driver.findElement (By.xpath (locator));}
    public List<WebElement> findElementsByXpath(String locator) {
        return waitVisibilityOfAllElementsLocatedBy(locator);
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
