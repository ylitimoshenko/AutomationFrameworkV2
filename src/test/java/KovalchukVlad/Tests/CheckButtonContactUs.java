package KovalchukVlad.Tests;

import ClasesToAll.TestInit;
import KovalchukVlad.Pages.ContactUsPage;
import KovalchukVlad.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckButtonContactUs extends TestInit {
    @Test
    public void AboutUsTest(){
        HomePage homePage = new HomePage(driver);
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        homePage.openSiteEatStreet();
        homePage.clickButtonGotIt();
        homePage.clickButtonContactUs();
        Assert.assertTrue(contactUsPage.searchTextEmail().isDisplayed());
    }

}
