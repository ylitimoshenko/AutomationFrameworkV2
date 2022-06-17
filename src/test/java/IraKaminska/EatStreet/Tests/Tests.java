package IraKaminska.EatStreet.Tests;

import ClasesToAll.TestInit;
import IraKaminska.Pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends TestInit {

    @Test
    public void checkRestaurantsInCalifornia() {
        HomePage homePage = new HomePage(driver);

        openUrl("https://eatstreet.com");
        homePage.getGotItBtn().click();
        homePage.getCheckboxTakeout().click();
        sleep(3);
        homePage.getInputFoodSearch().sendKeys("California");
        sleep(3);
        homePage.getCalifornia().click();
        sleep(3);
        Assert.assertTrue(homePage.checkList().isDisplayed());
    }

    @Test
    public void CheckTheCart() {
        openUrl("https://eatstreet.com/");
        HomePage homePage = new HomePage(driver);
        homePage.getGotItBtn().click();
        driver.findElements(By.xpath("//div[@class='navbar__icon']")).get(1).click();
        Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Your Cart is Empty']")).isDisplayed());
    }
}
