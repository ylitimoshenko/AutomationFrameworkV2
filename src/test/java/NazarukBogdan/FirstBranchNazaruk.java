package NazarukBogdan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstBranchNazaruk {
    @Test
    public void newBranchNazaruk() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa2.eatstreet.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='menu-signin']")).click();
        driver.findElement(By.xpath("//a[contains(text(), 'Sign Up')]")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("BogNazzz@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1237894560qaz.N");
        driver.findElement(By.xpath("//input[@id='passwordAgain']")).sendKeys("1237894560qaz.N");
        driver.findElements(By.xpath("//div[@ng-if='displayPasswordToggler']")).get(1).click();
        driver.findElement(By.xpath("//button[@id='signup']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("com"));
        driver.quit();
    }
}
