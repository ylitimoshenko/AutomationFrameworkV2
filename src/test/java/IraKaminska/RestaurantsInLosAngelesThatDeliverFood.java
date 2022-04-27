package IraKaminska;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class RestaurantsInLosAngelesThatDeliverFood extends TestInit {

    @Test
    public void restaurantsInLosAngelesThatDeliverFood () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://eatstreet.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("Los Angeles");
        sleep(2);
        driver.findElement(By.xpath("//li[@val='Los Angeles, CA, USA']")).click();
        sleep(3);
        driver.findElement(By.xpath("//label[@for='filter-Rating 4+']")).click();
        sleep(3);
        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(), 'matching restaurants near you')]")).isDisplayed());
    }

}
