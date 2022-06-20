package AlinaLevchenko.Tests;

import AlinaLevchenko.Pages.HomePageIssaPlus;
import ClasesToAll.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IssaPlus extends TestInit {


    @Test
    public void test1findProductInCart() {
        HomePageIssaPlus homePageIssaPlus = new HomePageIssaPlus(driver);
        openUrl("https://issaplus.com/ua/");
        homePageIssaPlus.clothesBtn().click();
        homePageIssaPlus.odezhdaBluzi().click();
        homePageIssaPlus.footCloseBtn().click();
        homePageIssaPlus.selectWhiteBluza().get(0).click();
        homePageIssaPlus.btnSizeL().click();
        homePageIssaPlus.selectBtnBuy().get(0).click();
        homePageIssaPlus.btnPrimary().click();

        Assert.assertTrue(homePageIssaPlus.IconFavorCout().isDisplayed());
    }
}
