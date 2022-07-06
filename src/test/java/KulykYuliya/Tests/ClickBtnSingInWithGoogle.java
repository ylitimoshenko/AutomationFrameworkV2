package KulykYuliya.Tests;

import ClasesToAll.TestInit;
import KulykYuliya.Pages.HomePage;
import KulykYuliya.Pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickBtnSingInWithGoogle extends TestInit {
    @Test
    public void SingInWithGoogleEatStreeet() {
        HomePage homePage = new HomePage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        homePage.OpenSiteEatStrt();
        fullscreen();
        homePage.clickBtnSingIn().click();
        registrationPage.clickSinfInWithGoogle().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("signin"));
        driver.quit();




    }
}
