package OlenaLevychkina.Tests;

import OlenaLevychkina.Web.EatstreetPageSignIn;
import OlenaLevychkina.Web.RestPageElements;
import OlenaLevychkina.Web.RestPageHelper;
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

    @Test
    public void TestMenuNewYork() {
        RestPageElements restPage = new RestPageElements(driver);
        RestPageHelper restPageHelper = new RestPageHelper(driver);
        openURL("https://qa2.eatstreet.com/");
        restPage.searchNameInput();
        restPage.sleep(3);
        restPage.searchGetFed().click();
        restPageHelper.clickBtnGotIt().click();
        sleep(3);
        restPageHelper.searchRestaurants().click();
        sleep(3);
        restPage.searchOmelettes();
        Assert.assertTrue(restPage.CheckSearchMenu().isDisplayed());
        driver.quit();
    }

    public void openURL(String site) {
        driver.get(site);
    }
}
