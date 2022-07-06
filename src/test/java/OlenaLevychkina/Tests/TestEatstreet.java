package OlenaLevychkina.Tests;

import ClasesToAll.TestInit;
import DubrovskiyVlad.Pages.HomePage;
import OlenaLevychkina.Web.EatstreetPageSignIn;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

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
    public void checkTextRestaurantLosAngeles() {
        HomePage homePage = new HomePage(driver);
        EatstreetPageSignIn signInPage = new EatstreetPageSignIn(driver);
        signInPage.navigate();
        homePage.clickButtonSignIn().click();
        signInPage.closeModal();
        signInPage.getEmailField().sendKeys("x-o-m@ukr.net");
        signInPage.getPassword().sendKeys("qwer4152sj");
        signInPage.getLoginBtn().click();
        signInPage.getLogo().click();
        sleep(3);
        homePage.getAddressField().sendKeys("Los Angeles");
        homePage.getFedBtn().click();
        homePage.checkAndClosePopUpWindow().click();
        homePage.getFedBtn().click();

        waitTILLELelementContainsText("//h1", "Los Angeles Restaurants That Deliver & Takeout");

        Assert.assertTrue(getElementByXpath("//h1").getText().contains("Los Angeles Restaurants That Deliver & Takeout"));
    }

}
