package JuliaTymoshenko.GoogleTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ListForMasive {
    WebDriver driver;

    @Test
    public void doit() {
        String googleSearch = "https://www.google.com";
        String bingSearch = "https://www.bing.com";
        String yahooSearch = "https://www.yahoo.com";

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(googleSearch);

        List<String> wordsToCheck = Arrays.asList("Cat", "Dog", "Straus", "pig", "horse", "bear", "chick", "bee", "Ant", "fish");

        for (String word : wordsToCheck) {
            driver.findElement(By.xpath("//input[@name='q']")).sendKeys(word + "\n");
            new WebDriverWait(driver, 15).until(ExpectedConditions.urlContains(word));
            Assert.assertTrue(driver.getCurrentUrl().contains(word));
            driver.get(googleSearch);
        }
    }

    @Test
    public void searchAnimals() {
        String yahooSearch = "https://www.yahoo.com";

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(yahooSearch);

        List<String> wordsToCheck = Arrays.asList("Cat", "Dog", "Straus", "pig", "horse", "bear", "chick", "bee");

        for (String word : wordsToCheck) {
            driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys(word + "\n");
            new WebDriverWait(driver, 15).until(ExpectedConditions.urlContains(word));
            Assert.assertTrue(driver.getCurrentUrl().contains(word));
            driver.get(yahooSearch);
        }
    }

    @Test
    public void searchAnimalsBing() {

        String bingSearch = "https://www.bing.com";

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(bingSearch);

        List<String> wordsToCheck = Arrays.asList("Cat", "Dog", "Straus", "pig", "horse", "bear", "chick", "bee");

        for (String word : wordsToCheck) {
            driver.findElement(By.xpath("//input[@name='q']")).sendKeys(word + "\n");
            new WebDriverWait(driver, 15).until(ExpectedConditions.urlContains(word));
            Assert.assertTrue(driver.getCurrentUrl().contains(word));
            driver.get(bingSearch);
        }
    }
}