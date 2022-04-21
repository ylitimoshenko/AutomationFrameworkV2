package IraKaminska;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;


public class RestaurantsInWashingtonThatDeliverHealthyFood extends TestInit {

    @Test
    public void restaurantsInWashingtonThatDeliverHealthyFood () {
        driver.get("https://eatstreet.com/");
        fullscreen();
        driver.findElement(By.xpath("//button[text()= 'Got it']")).click();
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("Washington");
        sleep(3);
        driver.findElement(By.xpath("//li[@val='Washington D.C., DC, USA']")).click();
        sleep(3);
        driver.findElement(By.xpath("//label[contains(text(), 'Healthy Food')]")).click();
        sleep(3);
        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(), 'matching restaurants near you')]")).isDisplayed());
    }

}
