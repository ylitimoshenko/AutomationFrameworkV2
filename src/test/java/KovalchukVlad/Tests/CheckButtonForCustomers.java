package KovalchukVlad.Tests;

import KovalchukVlad.Pages.ForCustomersPage;
import KovalchukVlad.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class CheckButtonForCustomers extends TestInit {
    @Test
    public void forCustomers(){
        HomePage homePage = new HomePage(driver);
        ForCustomersPage forCustomersPage = new ForCustomersPage(driver);
        homePage.openSiteEatStreet();
        homePage.clickButtonGotIt();
        homePage.clickButtonForCustomers();
        Assert.assertTrue(forCustomersPage.searchTextYouHungry().isDisplayed());
    }
}
