package DubrovskiyVlad.Tests;

import ClasesToAll.TestInit;
import DubrovskiyVlad.Pages.ContactUsPage;
import DubrovskiyVlad.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUs extends TestInit {

    @Test
    public void ContactUs(){
        HomePage homePage = new HomePage(driver);
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        homePage.openSiteEatstreet();
        fullscreen();
        homePage.clickGoiItcookie().click();
        homePage.clickContctUs();
        Assert.assertTrue(contactUsPage.CheckContactUs().isDisplayed());



    }
}
