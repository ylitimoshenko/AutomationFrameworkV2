package KulykYuliya.Tests;

import ClasesToAll.TestInit;
import KulykYuliya.Pages.HomePage;
import KulykYuliya.Pages.TakeOutPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TakeOut extends TestInit {
    @Test
    public void clickBtnTakeOut() {
        HomePage homePage = new HomePage(driver);
        TakeOutPage takeOutPage = new TakeOutPage(driver);
        homePage.OpenSiteEatStrt();
        fullscreen();
        takeOutPage.clickBtnTakeOut().click();
        Assert.assertTrue(takeOutPage.checkTakeOut().isDisplayed());
        driver.quit();



    }

}
