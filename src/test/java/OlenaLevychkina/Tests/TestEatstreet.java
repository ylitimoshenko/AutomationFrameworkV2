package OlenaLevychkina.Tests;

import OlenaLevychkina.Web.EatstreetPageSignIn;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class TestEatstreet extends TestInit {
    @Test
    public void heckHeaderEatstreet() {
        EatstreetPageSignIn signInPage = new EatstreetPageSignIn(driver);
        signInPage.navigate();
        signInPage.getEmailField().sendKeys("vahvfcjkb");
        signInPage.getPassword().sendKeys("dgvusjhv");
        signInPage.closeModal();
        signInPage.getLoginBtn().click();
        sleep(2);
        Assert.assertTrue(signInPage.getErrorMSG().isDisplayed());
    }
    @Test
    public void searchMadison() {
        driver.get("https://qa2.eatstreet.com");
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("Madison\n");
        driver.findElement(By.xpath("//a[@id='enter-address-btn']")).click();
        driver.findElement(By.xpath("//a[@id='find-restaurants']")).click();
        sleep(4);

        Assert.assertTrue((driver.findElement(By.xpath("//h1")).getText().contains("Madison")));
    }
}
