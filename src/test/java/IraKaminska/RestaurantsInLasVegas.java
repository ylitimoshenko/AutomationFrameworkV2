package IraKaminska;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class RestaurantsInLasVegas extends TestInit {

    @Test
    public void restaurantsInLasVegas() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://eatstreet.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[text()= 'Got it']")).click();
        driver.findElement(By.xpath("//label[@for='home-checkbox-takeout']")).click();
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("Las Vegas");
        sleep(3);
        driver.findElement(By.xpath("//li[@val='Las Vegas, NV, USA']")).click();
        sleep(3);
        driver.findElements(By.xpath("//div[@class='row filters-section ng-scope']//label")).get(0).click();
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='active_filter ng-binding ng-scope']")).isDisplayed());
    }

}
