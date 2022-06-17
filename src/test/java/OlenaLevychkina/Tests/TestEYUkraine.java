package OlenaLevychkina.Tests;

import ClasesToAll.TestInit;
import OlenaLevychkina.Web.EYUkraineHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEYUkraine extends TestInit {
    @Test
    public void eyukraineCheckLogin() {
        EYUkraineHomePage eyukraineHomePage = new EYUkraineHomePage(driver);
        eyukraineHomePage.navigateEYUkraine();

        eyukraineHomePage.getCookies().click();
        eyukraineHomePage.getMyaccountEY().click();
        eyukraineHomePage.getCookies1().click();
        eyukraineHomePage.getSignIn().click();
        eyukraineHomePage.getYourEmail().sendKeys("olenalevychkina@gmail.com");
        eyukraineHomePage.getNext().click();

        Assert.assertTrue(eyukraineHomePage.getGoogleAccount().isDisplayed());
    }
}
