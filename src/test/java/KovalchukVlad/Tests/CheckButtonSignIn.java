package KovalchukVlad.Tests;

import KovalchukVlad.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

import java.net.URL;

public class CheckButtonSignIn extends TestInit {

    @Test
    public void EatStreet(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        fullscreen();
        homePage.clickButtonSingIn().click();
        homePage.clickButtonGotIt().click();
        homePage.GetEmailAndWrite().sendKeys("vlad@gmail.com");
        homePage.GetPasswordAndWrite().sendKeys("passVlad");
        homePage.ClickButtonSingIn().click();
        Assert.assertTrue(homePage.IncorrectDataToLogIn().isDisplayed());
    }
}
