package DubrovskiyVlad.Tests;

import DubrovskiyVlad.Pages.HomePage;
import DubrovskiyVlad.Pages.LosAngRestPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

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
