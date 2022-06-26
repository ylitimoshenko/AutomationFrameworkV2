package BondarenkoYevhenii.Tests.Tests;

import BondarenkoYevhenii.Tests.Pages.YakabooHomePage;
import ClasesToAll.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckIfColorOfTheButtonChangeToRed extends TestInit {

    @Test

    public void checkIfColorOfButtonChangeToRed() {
        YakabooHomePage yakabooHomePage = new YakabooHomePage(driver);
        Actions action = new Actions(driver);
        openUrl("https://www.yakaboo.ua/");
        sleep(5);
        JavascriptExecutor  js  = (JavascriptExecutor) driver;
        String str = "return document.querySelector('body > div.grv-dialog-host').shadowRoot.querySelector('div > div > div.buttons-wrapper > button.sub-dialog-btn.block_btn')";
        WebElement btn = (WebElement)((JavascriptExecutor)driver).executeScript(str);
        btn.click();
        action.moveToElement(yakabooHomePage.aboutBtn()).perform();
        Assert.assertEquals(yakabooHomePage.aboutBtn().getCssValue("color"), "rgba(234, 87, 61, 1)");

    }

}