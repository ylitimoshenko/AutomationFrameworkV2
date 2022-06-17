package DubrovskiyVlad.Tests;

import ClasesToAll.TestInit;
import DubrovskiyVlad.Pages.HomePage;
import org.testng.annotations.Test;

public class ChekSingInbtn extends TestInit {

    @Test
    public void EatStreesSingIn() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        fullscreen();
        homePage.clickButtonSignIn().click();
        homePage.clickGoiItcookie().click();
        homePage.clickEmailWrite().sendKeys("vladdubrovskiy09@gmail.com");
        homePage.GetPasswordandWrite().sendKeys("89567654");




    }
}