package DubrovskiyVlad.Tests;

import ClasesToAll.TestInit;
import DubrovskiyVlad.Pages.HomePage;
import DubrovskiyVlad.Pages.LoginPage;
import DubrovskiyVlad.Pages.RegPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckSingUp extends TestInit {

        @Test
        public void eatstreet(){
            HomePage homePage = new HomePage(driver);
            RegPage regPage = new RegPage(driver);
            LoginPage loginPage = new LoginPage(driver);
            homePage.openSiteEatstreet();
            fullscreen();
            homePage.getBtnSingIn().click();
            loginPage.clickcookieGotIt().click();
            loginPage.clickBtnSingUp();
            regPage.inputEmail();
            regPage.inputPassword();
            regPage.inputPassAgain();
            regPage.clickBtnSingUp();
            Assert.assertTrue(homePage.CheckMyProfile().isDisplayed());

        }
    }

