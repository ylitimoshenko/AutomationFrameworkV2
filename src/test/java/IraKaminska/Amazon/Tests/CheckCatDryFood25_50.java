package IraKaminska.Amazon.Tests;

import IraKaminska.AmazonPage.CatsPageA;
import IraKaminska.AmazonPage.HomePageA;
import IraKaminska.AmazonPage.PetSuppliesPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class CheckCatDryFood25_50 extends TestInit {

    @Test
    public void checkCatDryFood25_50 () {
        HomePageA homePageA = new HomePageA(driver);
        openUrl("https://www.amazon.com/");
        homePageA.clickAllBtn().click();
        homePageA.clickPetSuppliesBtn().click();
        homePageA.clickSearchBtn().click();
        PetSuppliesPage petSuppliesPage = new PetSuppliesPage(driver);
        petSuppliesPage.clickCatsBtn().click();
        CatsPageA catsPageA = new CatsPageA(driver);
        catsPageA.clickCatFoodBtn().click();
        catsPageA.clickCatDryFoodBtn().click();
        catsPageA.clickCatDryFood25_50().click();

        Assert.assertTrue(catsPageA.checkURLCatDryFood());
    }
}
