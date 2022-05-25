package DubrovskiyVlad.Tests;

import DubrovskiyVlad.Pages.AboutUsPage;
import DubrovskiyVlad.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class AboutUsTest extends TestInit {

    @Test
    public void testAboutUs(){
        HomePage homePage = new HomePage(driver);
        homePage.openSiteEatstreet();
        fullscreen();
        homePage.clickGoiItcookie().click();
        homePage.clickBtnAboutUs();
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        Assert.assertTrue(aboutUsPage.ConnectText().isDisplayed());
    }
}
