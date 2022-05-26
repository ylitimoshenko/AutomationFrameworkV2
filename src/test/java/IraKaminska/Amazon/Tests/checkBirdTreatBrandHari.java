package IraKaminska.Amazon.Tests;

import IraKaminska.AmazonPage.BirdsPageA;
import IraKaminska.AmazonPage.HomePageA;
import IraKaminska.AmazonPage.PetSuppliesPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class checkBirdTreatBrandHari extends TestInit {

    @Test
    public void CheckBirdTreatBrandHari () {
        HomePageA homePageA = new HomePageA(driver);
        openUrl("https://www.amazon.com/");
        homePageA.clickAllBtn().click();
        homePageA.clickPetSuppliesBtn().click();
        homePageA.clickSearchBtn().click();
        PetSuppliesPage petSuppliesPage = new PetSuppliesPage(driver);
        petSuppliesPage.clickBirdsBtn().click();
        BirdsPageA birdsPageA = new BirdsPageA(driver);
        birdsPageA.clickTreatsBtn().click();
        birdsPageA.clickBrandHari().click();

        Assert.assertTrue(birdsPageA.checkURLBirds());
    }
}
