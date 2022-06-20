package KovalchukVlad.Tests;

import ClasesToAll.TestInit;
import KovalchukVlad.Pages.HomePage;
import org.testng.annotations.Test;;

public class FIrstTest extends TestInit {

    @Test
    public void IntertopTest(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://intertop.ua/ua/");
        fullscreen();
        homePage.clickShoesButton().click();

    }
}
