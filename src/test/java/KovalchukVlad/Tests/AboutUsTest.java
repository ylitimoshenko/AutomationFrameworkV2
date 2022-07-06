package KovalchukVlad.Tests;

import ClasesToAll.TestInit;
import KovalchukVlad.Pages.AboutUsPage;
import KovalchukVlad.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutUsTest extends TestInit {

    @Test
    public void aboutUs(){
        HomePage homePage = new HomePage(driver);
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        homePage.openSiteEatStreet();
        homePage.clickButtonGotIt();
        homePage.clickButtonAboutUs();
        aboutUsPage.clickButtonLeadership();
        Assert.assertTrue(aboutUsPage.searchAssertAboutUsText().isDisplayed());
    }

}
