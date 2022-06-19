package IraKaminska.Amazon.Tests;

import ClasesToAll.TestInit;
import IraKaminska.AmazonPage.HomePageA;
import IraKaminska.AmazonPage.WomenClothPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAmazon1 extends TestInit {

    @Test
    public void checkDressesForWomen2022() {
        HomePageA homePageA = new HomePageA(driver);
        openUrl("https://www.amazon.com/");
        homePageA.inputTextForSearching().sendKeys("dresses for women 2022\n");
        WomenClothPage womenClothPage = new WomenClothPage(driver);
        womenClothPage.clickCasualDressesBtn().click();
        womenClothPage.clickPremiumBrandsBtn().click();

        Assert.assertTrue(womenClothPage.checkURLAdress());
    }
}
