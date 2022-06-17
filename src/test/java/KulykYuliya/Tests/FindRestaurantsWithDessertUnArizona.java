package KulykYuliya.Tests;

import ClasesToAll.TestInit;
import KulykYuliya.Pages.EnterPage;
import KulykYuliya.Pages.HomePage;
import KulykYuliya.Pages.RestPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FindRestaurantsWithDessertUnArizona extends TestInit {

    @Test
    public void findDessertsInArizonaState() {
        HomePage homePage = new HomePage(driver);
        EnterPage enterPage = new EnterPage(driver);
        RestPage restPage = new RestPage(driver);
        homePage.OpenSiteEatStrt();
        fullscreen();
        homePage.enterAdress();
        homePage.sleep(3);
        homePage.clickFed().click();
        enterPage.clickBtnGotIt().click();
        enterPage.choiseRestaurants().click();
        restPage.findDesserts();
        Assert.assertTrue(restPage.CheckRest().isDisplayed());
    }
        @Test
    public void enterYourAddress() {
        HomePage homePage = new HomePage(driver);
        RestPage restPage = new RestPage(driver);
        homePage.OpenSiteEatStrt();
        fullscreen();
        homePage.enterAdress();
        sleep(3);
        homePage.clickBtnGetFed().click();
        Assert.assertTrue(restPage.checkEnterAddress().isDisplayed());

}
}
