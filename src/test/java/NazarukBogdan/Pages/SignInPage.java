package NazarukBogdan.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

public class SignInPage extends BasePage {
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getResetPasswordBtn() {
        return driver.findElement(By.xpath("//span[@id='forgot-password']"));
    }

    public WebElement getResetWindow() {
        return driver.findElement(By.xpath("//div[text()= 'Reset your password']"));
    }

    public WebElement getSignUpPageBtn() {
        return driver.findElement(By.xpath("//a[text()= 'Sign Up']"));
    }
}
