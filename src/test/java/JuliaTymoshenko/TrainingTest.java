package JuliaTymoshenko;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import JuliaTymoshenko.HomePage;
import tests.TestInit;

public class TrainingTest extends TestInit {

   @Test
    public void testGoogle (){
       HomePage homePage = new HomePage(driver);
       openUrl("https://www.google.com.ua/");
       homePage.enterSentence().sendKeys("найкраще місто на землі бровари");
       homePage.enterBtnOk().click();
       homePage.clickLink().get(3).click();

       Assert.assertTrue(homePage.pageBrovaryFacebook().isDisplayed());
    }

    @Test
    public void testGoogleDoc() {
       HomePage homePage = new HomePage(driver);
       openUrl("https://www.google.com.ua/");
       homePage.enterSentence().sendKeys("google doc");
       homePage.enterBtnOk().click();
       homePage.clickLink().get(0).click();
       homePage.btnDocymenty().click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)", "");

       homePage.btnOpenGoogleDoc().click();
    }

}
