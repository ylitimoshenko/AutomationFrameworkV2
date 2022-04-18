package NazarukBogdan.Tests;

import NazarukBogdan.Pages.HomePage;
import NazarukBogdan.Pages.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class AboutEatStreetTests extends TestInit {
    @Test
    public void aboutEatStreer() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGotItBtn().click();
        homePage.getForCustomersBtn().click();
        Assert.assertTrue(homePage.getSearchAbUsBtn().size()>0);
        }
    @Test
    public void CheckResetPassword() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        fullscreen();
        homePage.getGotItBtn().click();
        homePage.getSignInBtn().click();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.getResetPasswordBtn().click();

        Assert.assertTrue(signInPage.getResetWindow().isDisplayed());
    }
}

