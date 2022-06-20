package KovalchukVlad.Tests;

import ClasesToAll.TestInit;
import KovalchukVlad.Pages.HomePage;
import KovalchukVlad.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckButtonSignIn extends TestInit {

    @Test
    public void EatStreet(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.openSiteEatStreet();
        fullscreen();
        homePage.getButtonSingIn().click();
        homePage.clickButtonGotIt();
        loginPage.getEmailInputField().sendKeys("vlad@gmail.com");
        loginPage.getPasswordInputField().sendKeys("passVlad");
        loginPage.getButtonSingIn().click();
        Assert.assertTrue(homePage.IncorrectDataToLogIn().isDisplayed());
        driver.quit();
    }
}
