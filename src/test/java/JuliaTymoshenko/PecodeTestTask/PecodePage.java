package JuliaTymoshenko.PecodeTestTask;

import ClasesToAll.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PecodePage extends BasePage {
    public PecodePage(WebDriver driver) {
        super(driver);

    }

    public void openURL() {
        driver.get("https://www.pecodesoftware.com/qa-portal/registerlogin/registerlogin.php");
    }

    public WebElement inputUserName() {
        return driver.findElement(By.xpath("//input[@placeholder='Username']"));
    }

    public WebElement inputPassword() {
        return driver.findElement(By.xpath("//input[@placeholder='Password']"));
    }

    public WebElement loginBtn() {
        return driver.findElement(By.xpath("//input[@value='Login']"));
    }

    public WebElement msgNoAccountFound() {
        return findElementByXpath("//span[contains(text(), 'No account found with that username')]");
    }

    public WebElement msgPleaseEnterUsername() {
        return findElementByXpath("//span[contains(text(), 'Please enter username')]");
    }

    public WebElement msgPleaseEnterPassword() {
        return findElementByXpath("//span[contains(text(), 'Please enter your password')]");
    }

    public WebElement msgPleaseTryAgainLater() {
        return findElementByXpath("//body[contains(text(), 'Oops! Something went wrong. Please try again later.')]");
    }

}
