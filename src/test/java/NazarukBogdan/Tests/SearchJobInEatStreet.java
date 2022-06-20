package NazarukBogdan.Tests;

import ClasesToAll.TestInit;
import NazarukBogdan.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SearchJobInEatStreet extends TestInit {
    @Test
    public void searchJobInEatStreet() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGotItBtn().click();
        homePage.getCareersBtn().click();
        sleep(2);
        Assert.assertTrue(homePage.getAllJobs().isDisplayed());
    }

    @Test
    public void GoToBlog() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGotItBtn().click();
        homePage.getBlogBtn().click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Assert.assertTrue(driver.getCurrentUrl().contains("blog"));
    }

}
