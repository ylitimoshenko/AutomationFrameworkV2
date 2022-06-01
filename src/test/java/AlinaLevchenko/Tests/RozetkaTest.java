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
}
