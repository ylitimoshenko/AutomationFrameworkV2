package NazarukBogdan.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

public class SignUpPage extends BasePage {
    public SignUpPage(WebDriver driver){
        super(driver);
    }

    public WebElement getEmailField() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    public WebElement getPasswordAgain() {
        return driver.findElement(By.xpath("//input[@id='passwordAgain']"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement getSignUpBtn() {
        return driver.findElement(By.xpath("//button[@id='signup']"));
    }

    public WebElement getErrorMSG() {
        return driver.findElement(By.xpath("//div[@id='email-validation-tag']"));
    }
}
