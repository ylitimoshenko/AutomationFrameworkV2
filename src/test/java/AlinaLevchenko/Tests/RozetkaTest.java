package AlinaLevchenko.Tests;
import AlinaLevchenko.Pages.RozetkaHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

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

    @Test
    public void childrensShoppingList() {
        RozetkaHomePage homePageRozetkaTest = new RozetkaHomePage(driver);
        openUrl("https://rozetka.com.ua/");
        homePageRozetkaTest.selectChildMenu().get(11).click();
        homePageRozetkaTest.selectСreativityВevelopment().click();
        homePageRozetkaTest.selectPazls().click();
        homePageRozetkaTest.overflowBtn().click();
        homePageRozetkaTest.catsBtn().click();
        homePageRozetkaTest.selectcatalog().click();
        homePageRozetkaTest.menuicon().get(11).click();
        homePageRozetkaTest.toysForBeach().click();
        homePageRozetkaTest.organizeForBath().click();
        homePageRozetkaTest.nadyvnieKresla().click();
        homePageRozetkaTest.nadyvnueBaseyny().click();

        Assert.assertTrue(homePageRozetkaTest.igrushkiDlyaVannuPlyagha().isDisplayed());
    }

    @Test
    public void laptopReview() {   //огляд ноутбуків на сайті
        RozetkaHomePage homePageRozetkaTest = new RozetkaHomePage(driver);
        openUrl("https://rozetka.com.ua/");
        homePageRozetkaTest.searchLaptop().sendKeys("Lenovo");
        homePageRozetkaTest.laptopsLenovo().click();
        homePageRozetkaTest.checkboxFilterLenovo().get(3).click();
        homePageRozetkaTest.menuBtn().click();
        homePageRozetkaTest.selectAsusBtn().get(0).click();
        homePageRozetkaTest.fourCoreProcessor().click();
        homePageRozetkaTest.inStockBtn().click();
        homePageRozetkaTest.iconMenuBtn().get(1).click();
        homePageRozetkaTest.helpCenterBtn().click();

        Assert.assertTrue(homePageRozetkaTest.mostRelevant().isDisplayed());
        Assert.assertTrue(homePageRozetkaTest.payment().isDisplayed());
        Assert.assertTrue(homePageRozetkaTest.informationAboutCargo().isDisplayed());
        Assert.assertTrue(homePageRozetkaTest.bonusAccountInPremium().isDisplayed());
        Assert.assertTrue(homePageRozetkaTest.warrantyReturn().isDisplayed());
        Assert.assertTrue(homePageRozetkaTest.delivery().isDisplayed());
        Assert.assertTrue(homePageRozetkaTest.helpsInOrder().isDisplayed());
        Assert.assertTrue(homePageRozetkaTest.websitePersonalAccount().isDisplayed());
        Assert.assertTrue(homePageRozetkaTest.otherSellers().isDisplayed());
    }
}
