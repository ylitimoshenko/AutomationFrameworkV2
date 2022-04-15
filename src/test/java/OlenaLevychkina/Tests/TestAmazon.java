package OlenaLevychkina.Tests;

import OlenaLevychkina.Web.AmazonHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class TestAmazon extends TestInit {
    @Test
    public void checkErrorMsgAmazon(){
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateAmazon();
        fullscreen();
        amazonHomePage.getAccountLists().click();
        amazonHomePage.getCreateAccount().click();
        amazonHomePage.getYourEmail().sendKeys("bchsbvss");
        amazonHomePage.getMobile().sendKeys("0997777777");
        amazonHomePage.getPassword().sendKeys("123456");
        amazonHomePage.getVerify().click();
        sleep(4);
        Assert.assertTrue(amazonHomePage.getErrorMSG().isDisplayed());
    }
}
