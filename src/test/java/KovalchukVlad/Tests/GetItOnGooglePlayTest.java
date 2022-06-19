package KovalchukVlad.Tests;

import ClasesToAll.TestInit;
import KovalchukVlad.Pages.HomePage;
import KovalchukVlad.Pages.PlayMarketPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class GetItOnGooglePlayTest extends TestInit {

    @Test
    public void clickBtnGetItOnGooglePlay(){
        HomePage homePage = new HomePage(driver);
        PlayMarketPage playMarketPage = new PlayMarketPage(driver);
        homePage.openSiteEatStreet();
        homePage.clickButtonGotIt();
        homePage.clickBtnGetItOnGooglePlay();

        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        Assert.assertTrue(playMarketPage.searchAppName().isDisplayed());
    }
}
