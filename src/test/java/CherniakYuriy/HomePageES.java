package CherniakYuriy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

import java.util.ArrayList;

public class HomePageES extends BasePage {
    public HomePageES(WebDriver driver) {
        super(driver);
    }

    public WebElement gotItBtn() {
        return driver.findElement(By.xpath("//button[contains(text(), 'Got it')]"));
    }

    public WebElement inputSearch() {
        return driver.findElement(By.xpath("//input[@id='input-food-search']"));
    }

    public WebElement clickEnterBtn() {
        return driver.findElement(By.xpath("//a[@id='enter-address-btn']"));
    }

    public WebElement clickGetFedBtn() {
        return driver.findElement(By.xpath("//a[@id='find-restaurants']"));
    }

    public WebElement clickBtnGotIt() {
        return driver.findElement(By.xpath("//button[contains(text(), 'Got it')]"));
    }

    public WebElement clickBtnAboutUs() {
        return driver.findElement(By.xpath("//a[contains(text(), 'About Us')]"));
    }

    public WebElement availabilityHeadquarters() {
        return driver.findElement(By.xpath("//h2[contains(text(), 'Headquarters')]"));
    }

    public WebElement getLiveChatBtn() {
        return driver.findElement(By.xpath("//span[contains(text(), 'Live Chat')]"));
    }

    public void goToTheSecondWindowTab(WebDriver driver, Integer seconds) {
        waitForNewTabOpened(seconds);
        ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
    public void waitForNewTabOpened(Integer seconds) {
        for (int a = 0; a < seconds * 2; a++) {
            ArrayList<String> tabs2 = new ArrayList(driver.getWindowHandles());
            if (tabs2.size() > 1) {
                break;
            }
        }
    }

    public WebElement getEndChat() {
        return driver.findElement(By.xpath("//button[contains(text(), 'End Chat')]"));
    }

    public WebElement getPhoenixLink() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Phoenix, AZ')]"));
    }

    public boolean chechURL() {
        return driver.getCurrentUrl().contains("/phoenix-az/home");
    }

    public WebElement signInBtn() {
        return driver.findElement(By.xpath("//a[@id='menu-signin']"));
    }

    public WebElement signUpBtn() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Sign Up')]"));
    }

    public WebElement logoBtn() {
        return driver.findElement(By.xpath("//img[@class='logo-alternate']"));
    }

    public WebElement checkHomePage() {
        return driver.findElement(By.xpath("//div[@class='landing-callout']"));
    }
}
