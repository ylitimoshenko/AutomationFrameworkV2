package VolodymyrHrytsiuk.Tests;

import VolodymyrHrytsiuk.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class battleNetTests extends TestInit {
    @Test
    public void battleNetShop() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eu.shop.battle.net/en-gb");
        sleep(3);
        homePage.checkWorldOfWarcraftGame().click();
        driver.navigate().back();
        sleep(5);
        homePage.checkWorldOfWarcraftClassicGame().click();
        driver.navigate().back();
        sleep(3);
        homePage.checkHearthstoneGame().click();
        driver.navigate().back();
        sleep(3);
        homePage.checkOverwatchGame().click();
        driver.navigate().back();
        sleep(3);
        homePage.checkDiabloImmortalGame().click();
        driver.navigate().back();
        sleep(3);
        homePage.checkDiabloIIResurrectedGame().click();
        driver.navigate().back();
        sleep(3);
        homePage.checkDiabloIIIGame().click();
        driver.navigate().back();
        homePage.checkWarcraftIII().click();
        sleep(3);
        homePage.wrctReforgedIcon().click();
        sleep(3);

        Assert.assertTrue(homePage.buyNowReforgedIIIButton().isDisplayed());
    }
}
