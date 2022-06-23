package AlinaLevchenko.Tests;
import AlinaLevchenko.Pages.RozetkaHomePage;
import ClasesToAll.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RozetkaTest extends TestInit {

    @Test
    public void putLaptopInBasket() {
        RozetkaHomePage homePageRozetkaTest = new RozetkaHomePage(driver);
        openUrl("https://rozetka.com.ua/");
        homePageRozetkaTest.munuCategories().get(0).click();
        sleep(3);
        homePageRozetkaTest.selectLaptop().get(1).click();
        homePageRozetkaTest.selectLaptopAcerAspire().get(0).click();
        sleep(3);
        homePageRozetkaTest.putInBasket().click();
        sleep(3);
        homePageRozetkaTest.placeOnOrder().click();
        sleep(3);

        Assert.assertTrue(homePageRozetkaTest.ordering().isDisplayed());
    }

    @Test
    public void petProducts() {
        RozetkaHomePage homePageRozetkaTest = new RozetkaHomePage(driver);
        openUrl("https://rozetka.com.ua/");
        homePageRozetkaTest.selectMunuCategories().get(12).click();
        homePageRozetkaTest.tileDogs().get(1).click();
        homePageRozetkaTest.selectfeedForDog().get(0).click();
        homePageRozetkaTest.showMore().click();
        homePageRozetkaTest.feedForBulldog().click();
        homePageRozetkaTest.productCharacteristics().click();
        homePageRozetkaTest.buyInCreditBtn().click();
        homePageRozetkaTest.selectOnFourPartsBtn().get(1).click();

        Assert.assertTrue(homePageRozetkaTest.orderingBuy().isDisplayed());
    }
}
