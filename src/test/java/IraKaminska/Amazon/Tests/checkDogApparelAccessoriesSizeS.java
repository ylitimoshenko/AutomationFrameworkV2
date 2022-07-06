package IraKaminska.Amazon.Tests;

import ClasesToAll.TestInit;
import IraKaminska.AmazonPage.DogsPageA;
import IraKaminska.AmazonPage.HomePageA;
import IraKaminska.AmazonPage.PetSuppliesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkDogApparelAccessoriesSizeS extends TestInit {

    @Test
    public void CheckDogApparelAccessoriesSizeS () {
        HomePageA homePageA = new HomePageA(driver);
        openUrl("https://www.amazon.com/");
        homePageA.clickAllBtn().click();
        homePageA.clickPetSuppliesBtn().click();
        homePageA.clickSearchBtn().click();
        PetSuppliesPage petSuppliesPage = new PetSuppliesPage(driver);
        petSuppliesPage.clickDogsBtn().click();
        DogsPageA dogspageA = new DogsPageA(driver);
        dogspageA.clickDogApparelAccessories().click();
        dogspageA.clickDogApparelCostumes().click();
        dogspageA.clickDogApparelAccessoriesSizeS().click();

        Assert.assertTrue(dogspageA.checkURLdogs());
    }
}
