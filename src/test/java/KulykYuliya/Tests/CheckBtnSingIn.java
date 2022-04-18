package KulykYuliya.Tests;

import KovalchukVlad.Pages.LoginPage;
import KulykYuliya.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class CheckBtnSingIn extends TestInit {
    @Test
    public void LogOnEatStreet() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.OpenSiteEatStreet();
        fullscreen();
        homePage.closeBtnGotIt().click();
        homePage.getBtnSingIn().click();
        loginPage.enterEmailInField().sendKeys("kulykyuliya@gmail.com");
        loginPage.enterPassInField().sendKeys("uehuflf66");
        loginPage.getBtnSingIn().click();
        Assert.assertTrue(homePage.IncorrectDataToLogIn().isDisplayed());
        driver.quit();

    }
}
