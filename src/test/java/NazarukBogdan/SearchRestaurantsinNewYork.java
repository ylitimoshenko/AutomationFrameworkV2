package NazarukBogdan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchRestaurantsinNewYork {
    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void SearchRestaurantsinNewYorkTekeOut() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://eatstreet.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("New York\n");
        driver.findElement(By.xpath("//a[@id='enter-address-btn']")).click();
        driver.findElement(By.xpath("//a[@id='find-restaurants']")).click();
        sleep(2);
        driver.findElement(By.xpath("//input[@id='filters-checkbox-takeout']")).click();
        driver.quit();


    }


}
