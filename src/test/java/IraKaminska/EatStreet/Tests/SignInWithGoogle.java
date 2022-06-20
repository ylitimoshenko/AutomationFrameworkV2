package IraKaminska.EatStreet.Tests;

import ClasesToAll.TestInit;
import IraKaminska.Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInWithGoogle extends TestInit {

    @Test
    public void signInWithGoogle () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.get("https://eatstreet.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='menu-signin']")).click();
        driver.findElement(By.xpath("//div[@id='uniqueid']")).click();
        homePage.goToTheSecondWindowTab(driver,10);
        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("kim.kaminska@gmail.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("account"));
    }

}

