package IraKaminska.Amazon.Tests;

import ClasesToAll.TestInit;
import IraKaminska.AmazonPage.DogsPageA;
import IraKaminska.AmazonPage.HomePageA;
import IraKaminska.AmazonPage.PetSuppliesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DogDentalCareHealthSuppliesUpTo25 extends TestInit {

    @Test
    public void dogDentalCareHealthSuppliesUpTo25 () {
        HomePageA homePageA = new HomePageA(driver);
        openUrl("https://www.amazon.com/");
        homePageA.clickAllBtn().click();
        homePageA.clickPetSuppliesBtn().click();
        homePageA.clickSearchBtn().click();
        PetSuppliesPage petSuppliesPage = new PetSuppliesPage(driver);
        petSuppliesPage.clickDogsBtn().click();
        DogsPageA dogsPageA = new DogsPageA(driver);
        dogsPageA.clickDogHealthSuppliesBtn().click();
        dogsPageA.clickDogDentalCareBtn().click();
        dogsPageA.clickUpT025Btn().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("pets-intl-ship&bbn"));
    }
}
