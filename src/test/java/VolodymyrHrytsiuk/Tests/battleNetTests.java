package VolodymyrHrytsiuk.Tests;

import ClasesToAll.TestInit;
import VolodymyrHrytsiuk.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class battleNetTests extends TestInit {
    @Test
    public void battleNetShop() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eu.shop.battle.net/en-gb");
        sleep(3);
        homePage.checkWarcraftIII().click();
        sleep(1);
        homePage.wrctReforgedIcon().click();
        sleep(1);

        Assert.assertTrue(homePage.buyNowReforgedIIIButton().isDisplayed());
    }
}
