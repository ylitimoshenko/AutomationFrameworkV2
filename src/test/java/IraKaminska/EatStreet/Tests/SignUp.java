package IraKaminska.EatStreet.Tests;

import ClasesToAll.TestInit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUp extends TestInit {

    @Test
    public void SignUp () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://eatstreet.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[text()= 'Got it']")).click();
        driver.findElement(By.xpath("//a[@id='menu-signin']")).click();
        driver.findElement(By.xpath("//a[text()= 'Sign Up']")).click();
        sleep(3);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("i.pushkarchuk@lntu.edu.ua");
        sleep(3);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12365Iram");
        sleep(3);
        driver.findElement(By.xpath("//input[@id='passwordAgain']")).sendKeys("12365Iram");
        sleep(3);
        Assert.assertTrue(driver.getCurrentUrl().contains("eatstreet"));
    }

}
