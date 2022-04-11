package KulykYuliya;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FifthTestForGit1 {
    @Test
    public void FourthTestGorGit() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa2.eatstreet.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='menu-my-account']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("signin"));
        driver.quit();

    }
}
