package DubrovskiyVlad;

import ClasesToAll.TestInit;
import DubrovskiyVlad.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends TestInit {

    @Test
    public void eattreetSingIn() {

        HomePage homePage = new HomePage(driver);
        driver.manage().window().maximize();
        openUrl("https://eatstreet.com/");
        homePage.clickButtonSignIn().click();
        homePage.clickGoiItcookie().click();
        homePage.clickEmailWrite().sendKeys("vladdubrovskiy09@gmail.com");
        homePage.GetPasswordandWrite().sendKeys("dsfdfsdfds");
        homePage.GetSingInclick().click();
        Assert.assertTrue(homePage.inCorrectLogin().isDisplayed());
    }


}
