package KovalchukVlad.Tests;

import KovalchukVlad.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class CartTest extends TestInit {

    @Test
    public void checkButtonCart(){
        HomePage homePage = new HomePage(driver);
        homePage.openSiteEatStreet();
        homePage.clickButtonGotIt();
        homePage.clickButtonCart();
        Assert.assertTrue(homePage.searchTextCartEmpty().isDisplayed());
    }
}
