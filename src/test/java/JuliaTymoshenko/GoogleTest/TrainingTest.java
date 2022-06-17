package JuliaTymoshenko.GoogleTest;

import ClasesToAll.TestInit;
import JuliaTymoshenko.Pages.GooglePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class  TrainingTest extends TestInit {

    @Test
    public void testGoogle() {
        GooglePage googlePage = new GooglePage(driver);
        openUrl("https://www.google.com.ua/");
        googlePage.enterSentence().sendKeys("найкраще місто на землі бровари");
        sleep(2);
        googlePage.enterBtnOk().click();
        googlePage.clickLink().get(3).click();

        Assert.assertTrue(googlePage.pageBrovaryFacebook().isDisplayed());
    }

    @Test
    public void testGoogleDoc() {
        GooglePage googlePage = new GooglePage(driver);
        openUrl("https://www.google.com.ua/");
        googlePage.enterSentence().sendKeys("google doc");
        googlePage.enterBtnOk().click();
        googlePage.clickLink().get(0).click();
        googlePage.btnDocymenty().click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)", "");

        googlePage.btnOpenGoogleDoc().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("accounts"));
    }

}
