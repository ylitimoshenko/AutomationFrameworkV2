package KulykYuliya.Tests;

import ClasesToAll.TestInit;
import KulykYuliya.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
<<<<<<< HEAD

=======
>>>>>>> 0fc2ea172505d22da450f18637d69872a6b21c24

public class CheckBtnSingIn extends TestInit {
    @Test
    public void LogOnEatStreet() {
        HomePage homePage = new HomePage(driver);
        KulykYuliya.Pages.LoginPage loginPage = new KulykYuliya.Pages.LoginPage(driver);
        homePage.OpenSiteEatStrt();
        fullscreen();
        homePage.clickBtnSingIn().click();
        homePage.closeBtnGoIt().click();
        loginPage.enterEmailInField().sendKeys("kulykyuliya@gmail.com");
        loginPage.enterPassInField().sendKeys("uehuflf66");
        loginPage.getBtnSingIn().click();
        Assert.assertTrue(homePage.IncorrectDataToLogIn().isDisplayed());
        driver.quit();

    }
}
