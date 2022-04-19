package KulykYuliya.Tests;

import KulykYuliya.Pages.HomePage;
import org.testng.annotations.Test;
import tests.TestInit;

public class ClickBtnTakeOn extends TestInit {
    @Test
    public void ClickBtnTakeOn() {
        HomePage homePage = new HomePage(driver);
        homePage.OpenSiteEatStrt();
        fullscreen();

    }

}
