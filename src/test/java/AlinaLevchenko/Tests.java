package AlinaLevchenko;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class Tests extends TestInit {

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
}




