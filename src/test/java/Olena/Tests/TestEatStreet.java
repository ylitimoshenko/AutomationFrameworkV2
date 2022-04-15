package Olena.Tests;

import Olena.Web.EatstreetPageSignIn;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class TestEatStreet extends TestInit {
    @Test
    public void testcheckHeader() {
        EatstreetPageSignIn signInPage = new EatstreetPageSignIn(driver);
        signInPage.navigate();
        signInPage.getEmailField().sendKeys("vahvfcjkb");
        signInPage.getPassword().sendKeys("dgvusjhv");
        signInPage.closeModal();
        signInPage.getLoginBtn().click();
        sleep(2);
        Assert.assertTrue(signInPage.getErrorMSG().isDisplayed());
    }
}
