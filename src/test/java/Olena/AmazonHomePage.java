package Olena;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class AmazonHomePage extends BasePage {

    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateAmazon(){
        driver.get("https://www.amazon.com/");
    }


    public WebElement getAccountLists() {
        return driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
    }

    public WebElement getCreateAccount() {
        return driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
    }

    public WebElement getYourEmail() {
        return driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
    }

    public WebElement getMobile() {
        return driver.findElement(By.xpath("//input[@id='ap_email']"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.xpath("//input[@id='ap_password']"));
    }

    public WebElement getVerify() {
        return driver.findElement(By.xpath("//input[@id='continue']"));
    }

    public WebElement getErrorMSG() {
        return driver.findElement(By.xpath("//h1[contains(text(), 'Create account')]"));

    }
}
