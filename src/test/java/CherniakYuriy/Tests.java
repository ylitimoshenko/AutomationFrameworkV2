package CherniakYuriy;

import ClasesToAll.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends TestInit {

    @Test
    public void openRestInLV(){
        HomePageES homePageES = new HomePageES(driver);
        openUrl("https://eatstreet.com/");
        homePageES.gotItBtn().click();
        homePageES.inputSearch().sendKeys("Las Vegas\n");
        homePageES.clickEnterBtn().click();
        homePageES.clickGetFedBtn().click();
        sleep(3);
        RestoransPageES restoransPageES = new RestoransPageES(driver);
        restoransPageES.openNowBtn().click();

        Assert.assertTrue(restoransPageES.checkResult().isDisplayed());
    }

    @Test
    public void checkHeadquarters(){
        HomePageES homePageES = new HomePageES(driver);
        openUrl("https://eatstreet.com");
        homePageES.clickBtnGotIt().click();
        homePageES.clickBtnAboutUs().click();
        sleep(2);

        Assert.assertTrue(homePageES.availabilityHeadquarters().isDisplayed());
    }

    @Test
    public void checkLiveChat(){
        HomePageES homePageES = new HomePageES(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePageES.clickBtnGotIt().click();
        sleep(3);
        homePageES.getLiveChatBtn().click();
        homePageES.goToTheSecondWindowTab(driver,10);
        sleep(6);

        Assert.assertTrue(homePageES.getEndChat().isDisplayed());
    }

    @Test
    public void checkPhoenixLink(){
        HomePageES homePageES = new HomePageES(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePageES.clickBtnGotIt().click();
        homePageES.getPhoenixLink().click();

        Assert.assertTrue(homePageES.chechURL());
    }

    @Test
    public void mainPageReturn(){
        HomePageES homePageES = new HomePageES(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePageES.clickBtnGotIt().click();
        homePageES.signInBtn().click();
        homePageES.signUpBtn().click();
        homePageES.logoBtn().click();
        sleep(3);

        Assert.assertTrue(homePageES.checkHomePage().isDisplayed());
    }
}