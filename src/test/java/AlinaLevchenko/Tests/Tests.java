package AlinaLevchenko.Tests;

import AlinaLevchenko.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class Tests extends TestInit{

    @Test
    public void priceForDesignApartnent(){
        HomePage homePageInteriorDesign =  new HomePage(driver);
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
}




