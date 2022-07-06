package DubrovskiyVlad.Tests;

import ClasesToAll.TestInit;
import DubrovskiyVlad.Pages.HomePage;
import DubrovskiyVlad.Pages.PrivatyPolicePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PrivatyPolicyTest extends TestInit {

    @Test
    public void privatyPolicyTest(){
        HomePage homePage = new HomePage(driver);
        homePage.openSiteEatstreet();
        fullscreen();
        homePage.clickGoiItcookie().click();
        homePage.clickPrivatyPolicy();
        PrivatyPolicePage privatyPolicePage = new PrivatyPolicePage(driver);
        Assert.assertTrue(privatyPolicePage.textContactsUs().isDisplayed());

    }
}
