package AlinaLevchenko.Tests;

import AlinaLevchenko.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class Tests extends TestInit {

    @Test
    public void priceForDesignApartnent() {
        HomePage homePageInteriorDesign = new HomePage(driver);
        openUrl("https://polyakova.biz/ua");
        homePageInteriorDesign.price().click();
        homePageInteriorDesign.designInteriorPriceBtn().get(13);
        sleep(3);
        homePageInteriorDesign.imgPriceOpen().get(1).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("price"));
    }

    @Test
    public void putProductInBasket() {
        HomePage homePageZakazUa = new HomePage(driver);
        openUrl("https://zakaz.ua/uk/");
        sleep(3);
        homePageZakazUa.goToNovus().click();
        homePageZakazUa.fruitsAndVegetablesBtn().click();
        homePageZakazUa.fruits().get(0).click();
        homePageZakazUa.selectFruits().get(0).click();
        homePageZakazUa.addBtn().get(1).click();
        homePageZakazUa.deliveryTape().click();

        Assert.assertTrue(homePageZakazUa.cityBtn().isDisplayed());
    }

    @Test
    public void listShops() {
        HomePage homePageZakazUa = new HomePage(driver);
        openUrl("https://zakaz.ua/uk/");
        homePageZakazUa.ultramarket().click();
        homePageZakazUa.selectBacary().get(1).click();
        homePageZakazUa.selectBread().get(4).click();

        Assert.assertTrue(homePageZakazUa.bread().isDisplayed());
    }

    @Test
    public void contacts() {
        HomePage homePageZakazUa = new HomePage(driver);
        openUrl("https://zakaz.ua/uk/");
        homePageZakazUa.selectContacts().get(0).click();
        sleep(3);
        homePageZakazUa.adress().click();

        Assert.assertTrue(homePageZakazUa.contentZakazUa().get(0).isDisplayed());

    }
}




