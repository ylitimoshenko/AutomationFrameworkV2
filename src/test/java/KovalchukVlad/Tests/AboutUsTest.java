package KovalchukVlad.Tests;

import KovalchukVlad.Pages.AboutUsPage;
import KovalchukVlad.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class AboutUsTest extends TestInit {

    @Test
    public void AboutUs(){
        HomePage homePage = new HomePage(driver);
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        homePage.openSiteEatStreet();
        fullscreen();
        homePage.clickButtonGotIt();
        homePage.clickButtonAboutUs();
        aboutUsPage.clickButtonLeadership();
        Assert.assertTrue(aboutUsPage.searchAssertAboutUsText().isDisplayed());
        driver.quit();
    }

}
