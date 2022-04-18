package NazarukBogdan.Tests;

import NazarukBogdan.Pages.AboutUsPage;
import NazarukBogdan.Pages.HomePage;
import NazarukBogdan.Pages.SignInPage;
import NazarukBogdan.Pages.SignUpPage;
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

    @Test
    public void CheckAboutUsInfo() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        fullscreen();
        homePage.getGotItBtn().click();
        homePage.getAboutUsBtn().click();

        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        sleep(2);
        Assert.assertTrue(aboutUsPage.getAboutUsInfo().isDisplayed());
    }

    @Test
    public void SignUpError() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        fullscreen();
        homePage.getGotItBtn().click();
        homePage.getSignInBtn().click();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.getSignUpPageBtn().click();

        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.getEmailField().sendKeys("QfdfskxcGmail.com");
        signUpPage.getPassword().sendKeys("123wsx//745");
        signUpPage.getPasswordAgain().sendKeys("123wsx//745");
        signUpPage.getSignUpBtn().click();
        sleep(2);
        Assert.assertTrue(signUpPage.getErrorMSG().isDisplayed());

    }
}

