package KulykYuliya.Tests;

import KulykYuliya.Pages.HomePage;
import KulykYuliya.Pages.LoginPage;
import KulykYuliya.Pages.RegistrationPage;
import KulykYuliya.Pages.RestPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class TasksForGira extends TestInit {
    @Test
    public void checkSingOut() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.OpenSiteEatStrt();
        fullscreen();
        loginPage.clickSingIn().click();
        loginPage.enterPersonalEmail();
        loginPage.enterPersonalPassword();
        loginPage.chickBtbGotIt().click();
        loginPage.checkBtnSingIn().click();
        Assert.assertTrue(loginPage.checkSing().isDisplayed());
    }

    @Test
    public void usedBtnGetFed() {
        HomePage homePage = new HomePage(driver);
        homePage.OpenSiteEatStrt();
        fullscreen();
        homePage.clickBtnGetFed().click();
        Assert.assertTrue(homePage.checkBtnGetFed().isDisplayed());
        driver.quit();
    }

    @Test
    public void enterYourAddress() {
        HomePage homePage = new HomePage(driver);
        RestPage restPage = new RestPage(driver);
        homePage.OpenSiteEatStrt();
        fullscreen();
        homePage.enterAdress();
        sleep(3);
        homePage.clickBtnGetFed().click();
        Assert.assertTrue(restPage.checkEnterAddress().isDisplayed());

    }

    @Test
    public void ChoiceOptionDelivery() {
        HomePage homePage = new HomePage(driver);
        homePage.OpenSiteEatStrt();
        fullscreen();
        homePage.clickBtnDelivery().click();
        Assert.assertTrue(homePage.checkBtnDelivery().isDisplayed());
        driver.quit();

    }

    }






