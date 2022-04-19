package JuliaTymoshenko.EatStreet.Tests;

import JuliaTymoshenko.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class SelectRestorants extends TestInit {

    @Test
    public void sortByRatingRestInDallas() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getAdressInput().sendKeys("Dallas, TX");
        sleep(2);
        homePage.getFedBtn().click();
        sleep(5);
        homePage.checkAndClousePopUpWindow();
        homePage.clickSortByIMGBtn().click();
        homePage.clickSortByRatingBtn().click();
        homePage.clickSortByIMGBtn().click();
        homePage.clickSortDeliveryFreeBtn().click();
        Assert.assertTrue(homePage.clickSortDeliveryFreeBtn().isDisplayed());
    }
}
