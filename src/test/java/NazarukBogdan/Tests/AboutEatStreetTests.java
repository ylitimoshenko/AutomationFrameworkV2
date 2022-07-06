package NazarukBogdan.Tests;

import ClasesToAll.TestInit;
import NazarukBogdan.Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutEatStreetTests extends TestInit {
    @Test
    public void aboutEatStreer() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        fullscreen();
        homePage.getGotItBtn().click();
        homePage.getForCustomersBtn().click();
        Assert.assertTrue(homePage.getSearchAbUsBtn().size() > 0);
    }

    @Test
    public void CheckResetPassword() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        fullscreen();
        homePage.getGotItBtn().click();
        homePage.getSignInBtn().click();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.getResetPasswordBtn().click();

        Assert.assertTrue(signInPage.getResetWindow().isDisplayed());
    }

    @Test
    public void CheckAboutUsInfo() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        fullscreen();
        homePage.getGotItBtn().click();
        homePage.getAboutUsBtn().click();

        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        sleep(2);
        Assert.assertTrue(aboutUsPage.getAboutUsInfo().isDisplayed());
    }

    @Test
    public void SignUpError() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        fullscreen();
        homePage.getGotItBtn().click();
        homePage.getSignInBtn().click();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.getSignUpPageBtn().click();

        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.getEmailField().sendKeys("QfdfskxcGmail.com");
        signUpPage.getPassword().sendKeys("123wsx//745");
        signUpPage.getPasswordAgain().sendKeys("123wsx//745");
        signUpPage.getSignUpBtn().click();
        sleep(2);
        Assert.assertTrue(signUpPage.getErrorMSG().isDisplayed());

    }

    @Test
    public void SearchRestaurantInBoston() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        fullscreen();
        homePage.getGotItBtn().click();
        sleep(3);
        homePage.getEnterAdress().sendKeys("boston\n");
        homePage.getEnterAdressBtn().click();
        sleep(3);
        homePage.getBostonBtn().click();
        sleep(4);
        Assert.assertTrue(homePage.getBostonRestaurants().isDisplayed());

    }

    @Test
    public void SearchRestaurantsInNYC() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        fullscreen();
        homePage.getGotItBtn().click();
        homePage.getAboutUsBtn().click();
        sleep(2);

        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        aboutUsPage.getTypeFood().sendKeys("fast food");
        aboutUsPage.getAdress().sendKeys("NYC\n");
        sleep(2);

        SearchRestaurantsPage searchRestaurantsPage = new SearchRestaurantsPage(driver);
        Assert.assertTrue(searchRestaurantsPage.getRestaurantsInNYC().isDisplayed());
    }

    @Test
    public void SearchRestaurantsInSalina() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        fullscreen();
        homePage.getGotItBtn().click();
        homePage.getSalinaBtn().click();
        sleep(2);
        homePage.getAsianFoodBtn().click();

        SearchRestaurantsPage searchRestaurantsPage = new SearchRestaurantsPage(driver);
        sleep(2);
        searchRestaurantsPage.getTakeOutBtn().click();
        sleep(2);

        Assert.assertTrue(searchRestaurantsPage.getNoResstaurants().isDisplayed());
    }

    @Test
    public void DriveES() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        fullscreen();
        homePage.getGotItBtn().click();
        homePage.getBecomeDriver().click();

        DriverCareersPage driverCareersPage = new DriverCareersPage(driver);
        sleep(3);
        Assert.assertTrue(driverCareersPage.getMoreInfo().isDisplayed());
    }
}

