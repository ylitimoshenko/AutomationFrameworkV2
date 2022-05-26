package IraKaminska.Amazon.Tests;

import IraKaminska.AmazonPage.HomePageA;
import IraKaminska.AmazonPage.PetSuppliesPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkDogDryFoodGlutenFree extends TestInit {

    @Test
    public void CheckDogDryFoodGlutenFree () {
        HomePageA homePageA = new HomePageA(driver);
        openUrl("https://www.amazon.com/");
        homePageA.clickAllBtn().click();
        homePageA.clickPetSuppliesBtn().click();
        homePageA.clickSearchBtn().click();
        PetSuppliesPage petSuppliesPage = new PetSuppliesPage(driver);
        petSuppliesPage.clickDogsBtn().click();
        petSuppliesPage.cklickDogsFoodBtn().click();
        petSuppliesPage.clickDryDogsFood().click();
        petSuppliesPage.clickDryDogsFoodGlutenFree().click();

        Assert.assertTrue(petSuppliesPage.checkURLAdressPetSupplies());
    }
}
