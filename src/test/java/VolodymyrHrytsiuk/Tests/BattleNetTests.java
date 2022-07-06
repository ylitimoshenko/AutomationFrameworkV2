package VolodymyrHrytsiuk.Tests;

import ClasesToAll.TestInit;
import VolodymyrHrytsiuk.Pages.HomePageW;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BattleNetTests extends TestInit {
    @Test
    public void battleNetShop() {
        HomePageW homePageWrc = new HomePageW(driver);
        openUrl("https://eu.shop.battle.net/en-gb");
        sleep(3);
        homePageWrc.checkWarcraftIII().click();
        sleep(1);
        homePageWrc.wrctReforgedIcon().click();
        sleep(1);

        Assert.assertTrue(homePageWrc.buyNowReforgedIIIButton().isDisplayed());
    }
}
