package NazarukBogdan.Tests;

import NazarukBogdan.Pages.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

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
}
