package AlinaLevchenko.Tests;
import AlinaLevchenko.Pages.HomePageHotline;
import ClasesToAll.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestHotline extends TestInit {

    @Test
    public void obzorTovarovNaStranice(){
        HomePageHotline homePageHotline = new HomePageHotline(driver);
        openUrl("https://hotline.ua/");
        homePageHotline.catalogTovaBtn().click();
        homePageHotline.menuAvtoMoto().get(3).click();
        homePageHotline.selectMotocukluSkyteruAvto().get(1).click();
        homePageHotline.motocukluSkyteru().click();
        homePageHotline.horwinCr6Btn().get(0).click();
        sleep(3);

        Assert.assertTrue(homePageHotline.zakrutuisholom().isDisplayed());
    }
}


