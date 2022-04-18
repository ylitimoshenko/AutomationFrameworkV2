package KulykYuliya.Tests;

import KulykYuliya.Pages.EnterPage;
import KulykYuliya.Pages.HomePage;
import KulykYuliya.Pages.RestPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class FindRestaurantsWithDessertUnArizona extends TestInit {

    @Test
    public void findDessertsInArizonaState() {
        HomePage homePage = new HomePage(driver);
        EnterPage enterPage = new EnterPage(driver);
        RestPage restPage = new RestPage(driver);
        homePage.OpenSiteEatStreet();
        fullscreen();
        homePage.enterAddress();
        homePage.sleep(3);
        homePage.clichFed().click();
        enterPage.clickBtnGotIt().click();
        enterPage.choiseRestaurants().click();
        restPage.findDesserts().click();
        Assert.assertTrue(restPage.CheckRest().isDisplayed());
        driver.quit();


        //enterPage.enterNameState.

    }
}
