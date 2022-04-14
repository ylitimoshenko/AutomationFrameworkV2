package KovalchukVlad.Tests;

import KovalchukVlad.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

import java.util.concurrent.TimeUnit;

public class CheckButtonSingUp extends TestInit {

    @Test
    public void eatStreet(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        fullscreen();
        homePage.clickButtonSingIn().click();
        homePage.clickButtonGotIt().click();
        homePage.clickButtonSingUp().click();
        homePage.inputEmailSingUp();
        homePage.inputPassSingUpFirst();
        homePage.inputPassSingUpSecond();
        sleep(2);
        homePage.clickButtonSingUpReg().click();
        sleep(3);
        Assert.assertTrue(homePage.CheckMyProfile().isDisplayed());
    }
}
