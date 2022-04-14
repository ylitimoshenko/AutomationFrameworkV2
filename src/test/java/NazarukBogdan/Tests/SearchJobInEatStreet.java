package NazarukBogdan.Tests;

import NazarukBogdan.Pages.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

import java.util.ArrayList;

public class SearchJobInEatStreet extends TestInit {
    @Test
    public void searchJobInEatStreet() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.getCareersBtn().click();
        sleep(2);
        Assert.assertTrue(homePage.getAllJobs().isDisplayed());
        driver.quit();
    }
    @Test
    public void GoToBlog() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.getBlogBtn().click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Assert.assertTrue(driver.getCurrentUrl().contains("blog"));
        driver.quit();
    }

}
