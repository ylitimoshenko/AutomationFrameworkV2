package BondarenkoYevhenii.Tests.Tests;

import BondarenkoYevhenii.Tests.Pages.YakabooHomePage;
import ClasesToAll.TestInit;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CheckIfColorOfTheButtonChangeToRed extends TestInit {

    @Test

    public void checkIfColorOfButtonChangeToRed(){
        YakabooHomePage yakabooHomePage = new YakabooHomePage(driver);
        Actions action = new Actions(driver);

        openUrl("https://www.yakaboo.ua/");
        sleep(5);
        action.moveToElement(yakabooHomePage.aboutBtn()).perform();
        Assert.assertEquals(yakabooHomePage.aboutBtn().getCssValue("color"),"rgba(234, 87, 61, 1)");
          }

    }


        openUrl("https://www.yakaboo.ua/");

