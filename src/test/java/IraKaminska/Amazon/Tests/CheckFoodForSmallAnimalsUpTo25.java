package IraKaminska.Amazon.Tests;

import ClasesToAll.TestInit;
import IraKaminska.AmazonPage.HomePageA;
import IraKaminska.AmazonPage.PetSuppliesPage;
import IraKaminska.AmazonPage.SmallAnimalsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckFoodForSmallAnimalsUpTo25 extends TestInit {

    @Test
    public void CheckFoodForSmallAnimalsUpTo25 () {
        HomePageA homePageA = new HomePageA(driver);
        openUrl("https://www.amazon.com/");
        homePageA.clickAllBtn().click();
        homePageA.clickPetSuppliesBtn().click();
        homePageA.clickSearchBtn().click();
        PetSuppliesPage petSuppliesPage = new PetSuppliesPage(driver);
        petSuppliesPage.clickSmallAnimals().click();
        SmallAnimalsPage smallAnimalsPage = new SmallAnimalsPage(driver);
        smallAnimalsPage.clickFoodForSmallAnimals().click();
        smallAnimalsPage.clickFoodForSmallAnimalsUpTo25().click();

        Assert.assertTrue(smallAnimalsPage.checkURLFoodForSmallAnimals());
    }
}
