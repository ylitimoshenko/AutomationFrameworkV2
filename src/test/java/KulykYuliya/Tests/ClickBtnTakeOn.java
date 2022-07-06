package KulykYuliya.Tests;

import ClasesToAll.TestInit;
import KulykYuliya.Pages.HomePage;
import org.testng.annotations.Test;

public class ClickBtnTakeOn extends TestInit {
    @Test
    public void ClickBtnTakeOn() {
        HomePage homePage = new HomePage(driver);
        homePage.OpenSiteEatStrt();
        fullscreen();

    }

}
