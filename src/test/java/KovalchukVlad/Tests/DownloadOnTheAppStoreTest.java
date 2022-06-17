package KovalchukVlad.Tests;

import ClasesToAll.TestInit;
import KovalchukVlad.Pages.AppStorePage;
import KovalchukVlad.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class DownloadOnTheAppStoreTest extends TestInit {

    @Test
    public void clickBtnDownloadOnTheAppStore(){
        HomePage homePage = new HomePage(driver);
        AppStorePage appStorePage = new AppStorePage(driver);
        homePage.openSiteEatStreet();
        homePage.clickButtonGotIt();
        homePage.clickBtnDownloadOnTheAppStore();

        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        Assert.assertTrue(appStorePage.searchAppName().isDisplayed());
    }
}
