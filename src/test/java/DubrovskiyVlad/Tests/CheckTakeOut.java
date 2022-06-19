package DubrovskiyVlad.Tests;

import ClasesToAll.TestInit;
import DubrovskiyVlad.Pages.HomePage;
import DubrovskiyVlad.Pages.LosAngRestPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckTakeOut extends TestInit {

    @Test
    public void eatstreet(){
        HomePage homePage = new HomePage(driver);
        LosAngRestPage losAngRestPage = new LosAngRestPage(driver);
        homePage.openSiteEatstreet();
        homePage.clickGoiItcookie();
        homePage.clickTakeOut();
        homePage.writeYouAdress();
        homePage.GetFedClick();
        homePage.closeLocation();
        homePage.GetFedClick();
       Assert.assertTrue(losAngRestPage.restoransList().isDisplayed());





    }
}
