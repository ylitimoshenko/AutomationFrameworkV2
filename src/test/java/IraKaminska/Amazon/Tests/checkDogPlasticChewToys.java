package IraKaminska.Amazon.Tests;

import ClasesToAll.TestInit;
import IraKaminska.AmazonPage.DogsPageA;
import IraKaminska.AmazonPage.HomePageA;
import IraKaminska.AmazonPage.PetSuppliesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkDogPlasticChewToys extends TestInit {

    @Test
    public void CheckDogPlasticChewToys () {
        HomePageA homePageA = new HomePageA(driver);
        openUrl("https://www.amazon.com/");
        homePageA.clickAllBtn().click();
        homePageA.clickPetSuppliesBtn().click();
        homePageA.clickSearchBtn().click();
        PetSuppliesPage petSuppliesPage = new PetSuppliesPage(driver);
        petSuppliesPage.clickDogsBtn().click();
        DogsPageA dogsPageA = new DogsPageA(driver);
        dogsPageA.clickDogToys().click();
        dogsPageA.clickDogChewToys().click();
        dogsPageA.clickDogPlasticChewToys().click();

        Assert.assertTrue(dogsPageA.checkURLDogPlasticChewToys());
    }
}
