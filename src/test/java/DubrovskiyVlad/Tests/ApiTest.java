package DubrovskiyVlad.Tests;

import DubrovskiyVlad.Pages.ApiPage;
import DubrovskiyVlad.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class ApiTest extends TestInit {

    @Test
    public void buttonApiTest(){
        HomePage homePage = new HomePage(driver);
        ApiPage apiPage = new ApiPage(driver);
        homePage.openSiteEatstreet();
        fullscreen();
        homePage.clickGoiItcookie().click();
        homePage.clickButtonApi();
        apiPage.goIframe();
        Assert.assertTrue(apiPage.textApi().isDisplayed());





    }
}
