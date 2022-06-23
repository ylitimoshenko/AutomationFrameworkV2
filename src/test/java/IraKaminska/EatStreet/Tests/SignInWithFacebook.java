package IraKaminska.EatStreet.Tests;

import ClasesToAll.TestInit;
import IraKaminska.Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInWithFacebook extends TestInit {

    @Test
    public void signInWithFacebook() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.get("https://eatstreet.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='menu-signin']")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-facebook btn-facebook__sign-in full-width ng-scope']")).click();
        homePage.goToTheSecondWindowTab(driver, 10);
        Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
    }

}
