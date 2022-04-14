package KovalchukVlad.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class RegPage extends BasePage {
    public RegPage(WebDriver driver) {
        super(driver);
    }

    public void inputEmail() {
        findElementByXpath("//input[@id='email']").sendKeys(System.currentTimeMillis() + "vlad@gmail.com");
    }

    public int inputPass() {
        findElementByXpath("//input[@id='password']").sendKeys("Vlad2201@yy");
        return 0;
    }

    public int inputPassAgain() {
        findElementByXpath("//input[@id='passwordAgain']").sendKeys("Vlad2201@yy");
        return 0;
    }
    public void clickButtonSingUp() {
         findElementByXpath("//button[@id='signup']").click();
    }
}
