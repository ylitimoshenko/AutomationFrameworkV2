package IraKaminska.Amazon.Tests;

import IraKaminska.AmazonPage.DogsPageA;
import IraKaminska.AmazonPage.HomePageA;
import IraKaminska.AmazonPage.PetSuppliesPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class CheckDogTreats extends TestInit {

    @Test
    public void checkDogTreats () {
        HomePageA homePageA = new HomePageA(driver);
        openUrl("https://www.amazon.com/");
        homePageA.clickAllBtn().click();
        homePageA.clickPetSuppliesBtn().click();
        homePageA.clickSearchBtn().click();
        PetSuppliesPage petSuppliesPage = new PetSuppliesPage(driver);
        petSuppliesPage.clickDogsBtn().click();
        DogsPageA dogsPageA = new DogsPageA(driver);
        dogsPageA.clickDogTreatsBtn().click();

        Assert.assertTrue(dogsPageA.checkURLDogTreats());
    }
}
