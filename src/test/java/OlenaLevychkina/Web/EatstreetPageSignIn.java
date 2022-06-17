package OlenaLevychkina.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

public class EatstreetPageSignIn extends BasePage {
    public EatstreetPageSignIn(WebDriver driver) {
        super(driver);
    }

    public void navigate() {
        driver.get("https://eatstreet.com/signin");
    }

    public WebElement getEmailField() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public void closeModal() {
        driver.findElement(By.xpath("//button[contains(text(),'Got it')]"));
    }

    public WebElement getLoginBtn() {
        return driver.findElement(By.xpath("//button[@id='signin']"));
    }

    public WebElement getErrorMSG() {
        return driver.findElement(By.xpath("//span[contains(text(), 'is incorrect.')]"));
    }

    public WebElement getLogo() {
        return driver.findElement(By.xpath("//img[@class='logo-alternate']"));
    }
}
