package DubrovskiyVlad;

import org.testng.annotations.Test;
import tests.TestInit;

public class FirstTest extends TestInit {

    @Test
    public void eattreetSingIn(){

        HomePage homePage = new HomePage(driver);
        driver.manage().window().maximize();
        openUrl("https://eatstreet.com/");
        homePage.clickBlog().click();

    }

}
