package IraKaminska;

import ClasesToAll.TestInit;
import IraKaminska.Pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RestaurantsInChicagoTakeoutAmericanFood extends TestInit {

    @Test
    public void restaurantsInChicagoTakeoutAmericanFood () {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com");
        fullscreen();
        homePage.getGotItBtn().click();
        homePage.getCheckboxTakeout().click();
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("Chicago");
        sleep(3);
        driver.findElement(By.xpath("//a[text()= 'Get Fed']")).click();
        sleep(3);
        driver.findElements(By.xpath("//div[@class='row filters-section ng-scope']//label")).get(2).click();
        sleep(3);
        driver.findElement(By.xpath("//label[contains(text(), 'American Food')]")).click();
        sleep(3);
        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(), 'matching restaurants near you')]")).isDisplayed());
        driver.quit();
    }

}
