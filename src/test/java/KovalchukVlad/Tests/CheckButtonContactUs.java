package KovalchukVlad.Tests;

import KovalchukVlad.Pages.HomePage;
import org.testng.annotations.Test;
import tests.TestInit;

public class CheckButtonAboutUs extends TestInit {
    @Test
    public void AboutUsTest(){
        HomePage homePage = new HomePage(driver);

        homePage.clickButtonAboutUs();
    }

}
