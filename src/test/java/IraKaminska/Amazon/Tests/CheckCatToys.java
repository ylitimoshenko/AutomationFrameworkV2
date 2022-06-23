package IraKaminska.Amazon.Tests;

import ClasesToAll.TestInit;
import IraKaminska.AmazonPage.CatsPageA;
import IraKaminska.AmazonPage.HomePageA;
import IraKaminska.AmazonPage.PetSuppliesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckCatToys extends TestInit {

    @Test
    public void checkCatToys () {
        HomePageA homePageA = new HomePageA(driver);
        openUrl("https://www.amazon.com/");
        homePageA.clickAllBtn().click();
        homePageA.clickPetSuppliesBtn().click();
        homePageA.clickSearchBtn().click();
        PetSuppliesPage petSuppliesPage = new PetSuppliesPage(driver);
        petSuppliesPage.clickCatsBtn().click();
        CatsPageA catsPageA = new CatsPageA(driver);
        catsPageA.clickCatToysBtn().click();

        Assert.assertTrue(catsPageA.checkURLCatToys());
    }
}
