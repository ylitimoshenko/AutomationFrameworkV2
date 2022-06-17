package KovalchukVlad.Tests;

import ClasesToAll.TestInit;
import KovalchukVlad.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

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
