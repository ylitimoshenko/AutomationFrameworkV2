package KovalchukVlad.Tests;

import KovalchukVlad.Pages.HomePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.TestInit;

public class FIrstTest extends TestInit {

    @Test
    public void IntertopTest(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://intertop.ua/ua/");
        fullscreen();
        homePage.clickShoesButton().click();

    }
}
