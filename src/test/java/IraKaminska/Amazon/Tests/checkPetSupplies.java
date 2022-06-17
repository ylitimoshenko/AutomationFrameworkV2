package IraKaminska.Amazon.Tests;

import ClasesToAll.TestInit;
import IraKaminska.AmazonPage.HomePageA;
import IraKaminska.AmazonPage.PetSuppliesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkPetSupplies extends TestInit {

    @Test
    public void CheckPetSupplies () {
        HomePageA homePageA = new HomePageA(driver);
        openUrl("https://www.amazon.com/");
        homePageA.clickAllBtn().click();
        homePageA.clickPetSuppliesBtn().click();
        homePageA.clickSearchBtn().click();
        PetSuppliesPage petSuppliesPage = new PetSuppliesPage(driver);

        Assert.assertTrue(petSuppliesPage.checkURLAdressPetSupplies());
    }
}
