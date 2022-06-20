package IraKaminska.EatStreet.Tests;

import ClasesToAll.TestInit;
import IraKaminska.Pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpecialRestaurantsInTexasTakeoutFood extends TestInit {

    @Test
    public void specialRestaurantsInTexasTakeoutFood () {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        fullscreen();
        homePage.getGotItBtn().click();
        driver.findElement(By.xpath("//label[@for='home-checkbox-takeout']")).click();
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("Texas City");
        sleep(3);
        driver.findElement(By.xpath("//li[@val='Texas City, TX, USA']")).click();
        sleep(3);
        driver.findElements(By.xpath("//div[@class='row filters-section ng-scope']//label")).get(4).click();
        sleep(3);
        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(), 'View more nearby restaurants')]")).isDisplayed());
    }

}
