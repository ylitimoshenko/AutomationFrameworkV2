package AlinaLevchenko.Tests;

import AlinaLevchenko.Pages.HomePagePriceForDesignApartament;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class TestpriceForDesignApartnent extends TestInit {
    @Test
    public void priceForDesignApartnent(){
        HomePagePriceForDesignApartament homePageInteriorDesign =  new HomePagePriceForDesignApartament()driver);
        openUrl("https://polyakova.biz/ua");
        homePageInteriorDesign.price().click();
        homePageInteriorDesign.designInteriorPriceBtn().get(13);
        sleep(3);
        homePageInteriorDesign.imgPriceOpen().get(1).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("price"));
    }
}

