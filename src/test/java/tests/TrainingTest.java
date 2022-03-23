package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.HomePage;

public class TrainingTest extends TestInit {

   @Test
    public void testGoogle (){
       HomePage homePage = new HomePage(driver);
       openUrl("https://www.google.com.ua/");
       homePage.enterSentence().sendKeys("найкраще місто на землі бровари");
       homePage.enterBtnOk().click();
       homePage.clickLinkBrovary().get(3).click();

       Assert.assertTrue(homePage.pageBrovaryFacebook().isDisplayed());
    }

}
