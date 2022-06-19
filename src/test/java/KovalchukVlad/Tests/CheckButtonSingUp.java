package KovalchukVlad.Tests;

import ClasesToAll.TestInit;
import KovalchukVlad.Pages.HomePage;
import KovalchukVlad.Pages.LoginPage;
import KovalchukVlad.Pages.RegPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckButtonSingUp extends TestInit {

    @Test
    public void eatStreet(){
        HomePage homePage = new HomePage(driver);
        RegPage regPage = new RegPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.openSiteEatStreet();
        fullscreen();
        homePage.getButtonSingIn().click();
        loginPage.clickButtonGotItCookies();
        loginPage.clickButtonSingUp().click();
        regPage.inputEmail();
        regPage.inputPass();
        regPage.inputPassAgain();
        regPage.clickButtonSingUp();
        Assert.assertTrue(homePage.CheckMyProfile().isDisplayed());
        driver.quit();
    }
}
