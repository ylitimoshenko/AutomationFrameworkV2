package DubrovskiyVlad.Pages;

import org.openqa.selenium.WebDriver;
import pageobject.BasePage;

public class RegPage extends BasePage {
    public RegPage(WebDriver driver) {
        super(driver);
    }


    public int inputEmail() {
        findElementByXpath("//input[@id='email']").sendKeys(System.currentTimeMillis() + "vladdublin09@gmail.com");
        return 0;
    }

    public int inputPassword() {
        findElementByXpath("//input[@id='password']").sendKeys("Vlad2201@yy");
        return 0;
    }

    public int inputPassAgain() {
        findElementByXpath("//input[@id='passwordAgain']").sendKeys("Vlad2201@yy");
        return 0;
    }

    public void clickBtnSingUp() {
        findElementByXpath("//button[@id='signup']").click();
    }


}
