package DubrovskiyVlad.Tests;

import ClasesToAll.TestInit;
import DubrovskiyVlad.Pages.BlogPage;
import DubrovskiyVlad.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class BlogBtnTest extends TestInit {

    @Test
    public void testBtnBlog(){

        HomePage homePage = new HomePage(driver);
        BlogPage blogPage = new BlogPage(driver);

        homePage.openSiteEatstreet();
        fullscreen();
        homePage.clickGoiItcookie().click();
        homePage.clickBtnBlog();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.switchTo().window(tabs2.get(0));
        Assert.assertTrue(blogPage.recentPosts().isDisplayed());

    }
}
