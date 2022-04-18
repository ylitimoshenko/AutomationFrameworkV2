package KovalchukVlad.Tests;

import KovalchukVlad.Pages.AboutUsPage;
import KovalchukVlad.Pages.HomePage;
import KovalchukVlad.Pages.LoginPage;
import KovalchukVlad.Pages.RegPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class FiveTestsHomeWork extends TestInit {
    @Test
    public void aboutUs(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        RegPage regPage = new RegPage(driver);
        AboutUsPage aboutUsPage = new AboutUsPage(driver);

        homePage.openSiteEatStreet();
        fullscreen();
        homePage.clickButtonGotIt();
        homePage.clickButtonAboutUs();
        Assert.assertTrue(aboutUsPage.containsAboutUsInfo());
        homePage.openSiteEatStreet();
    }
}
