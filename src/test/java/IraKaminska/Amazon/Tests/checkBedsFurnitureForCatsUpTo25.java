package IraKaminska.Amazon.Tests;

import ClasesToAll.TestInit;
import IraKaminska.AmazonPage.HomePageA;
import IraKaminska.AmazonPage.PetSuppliesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkBedsFurnitureForCatsUpTo25 extends TestInit {

    @Test
    public void CheckBedsFurnitureForCatsUpTo25 () {
        HomePageA homePageA = new HomePageA(driver);
        openUrl("https://www.amazon.com/");
        homePageA.clickAllBtn().click();
        homePageA.clickPetSuppliesBtn().click();
        homePageA.clickSearchBtn().click();
        PetSuppliesPage petSuppliesPage = new PetSuppliesPage(driver);
        petSuppliesPage.clickCatsBtn().click();
        petSuppliesPage.clickBedsFurniture().click();
        petSuppliesPage.clickBedsFurnitureUpTo25().click();

        Assert.assertTrue(petSuppliesPage.checkURLAdressPetSupplies());
    }
}
