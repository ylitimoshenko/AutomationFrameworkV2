package KulykYuliya.Tests;

import KulykYuliya.Pages.HomePage;
import KulykYuliya.Pages.LogOn;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class CheckBtnSingIn extends TestInit {
    @Test
    public void EatStreet() {
        HomePage homePage = new HomePage(driver);
        LogOn logOn = new LogOn(driver);
        homePage.OpenSiteEatStreet();
        fullscreen();
        homePage.closeBtnGotIt().click();
        homePage.getBtnSingIn().click();
        logOn.enterEmailInField().sendKeys("kulykyuliya@gmail.com");
        logOn.enterPassInField().sendKeys("uehuflf66");
        logOn.getBtnSingIn().click();
        Assert.assertTrue(homePage.IncorrectDataToLogIn().isDisplayed());
        driver.quit();

    }
}
