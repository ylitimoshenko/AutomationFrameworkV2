package NazarukBogdan.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {super(driver);}

    public WebElement getCareersBtn() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Careers')]"));
    }

    public WebElement getGotItBtn() {
        return driver.findElement(By.xpath("//button[contains(text(), 'Got it')]"));
    }

    public WebElement getAllJobs() {
        return driver.findElement(By.xpath("//h2[contains(text(), 'All Jobs')]"));
    }

    public WebElement getBlogBtn() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Blog')]"));
    }

    public List<WebElement> getSearchAbUsBtn() {
        return driver.findElements(By.xpath("//a[contains(text(), 'About Us')]"));
    }

    public WebElement getForCustomersBtn() {
        return driver.findElement(By.xpath("//a[contains(text(), 'For Customers')]"));
    }

    public WebElement getSignInBtn() {
        return driver.findElement(By.xpath("//a[@id='menu-signin']"));
    }

    public WebElement getAboutUsBtn() {
        return driver.findElement(By.xpath("//a[text()= 'About Us']"));
    }

    public WebElement getEnterAdress() {
        return driver.findElement(By.xpath("//input[@id='input-food-search']"));
    }

    public WebElement getEnterAdressBtn() {
        return driver.findElement(By.xpath("//a[@id='enter-address-btn']"));
    }

    public WebElement getGetFedBtn() {
        return driver.findElement(By.xpath("//a[@id='find-restaurants']"));
    }

    public WebElement getBostonBtn() {
        return driver.findElement(By.xpath("//li[text()= 'Boston, Массачусетс, Сполучені Штати Америки']"));
    }

    public WebElement getBostonRestaurants() {
        return driver.findElement(By.xpath("//h1[text()= 'Boston Restaurants That Deliver & Takeout']"));
    }
}
