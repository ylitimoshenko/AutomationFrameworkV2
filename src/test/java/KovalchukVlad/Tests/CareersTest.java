package KovalchukVlad.Tests;

import ClasesToAll.TestInit;
import KovalchukVlad.Pages.CareersPage;
import KovalchukVlad.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CareersTest extends TestInit {

    @Test
    public void checkButtonCareers(){
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);
        homePage.openSiteEatStreet();
        homePage.clickButtonGotIt();
        homePage.clickButtonCareers();
        Assert.assertTrue(careersPage.searchText().isDisplayed());
    }
}
