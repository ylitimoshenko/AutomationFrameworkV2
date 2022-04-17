package KulykYuliya.Tests;

import KulykYuliya.Pages.HomePage;
import KulykYuliya.Pages.RgPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class ClickBtnSingInWithGoogle extends TestInit {
    @Test
    public void EatStrrt() {
        HomePage homePage = new HomePage(driver);
        RgPage rgPage = new RgPage(driver);
        homePage.OpenSiteEatStrt();
        fullscreen();
        homePage.clickBtnSingIn().click();
        rgPage.clickSinfInWithGoogle().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("signin"));
        driver.quit();




    }
}
