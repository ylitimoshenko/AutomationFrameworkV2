package JuliaTymoshenko.EatStreet.Tests;

import JuliaTymoshenko.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestInit;

public class LiveChat extends TestInit {

    @Test
    public void livechat() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.clickBtnLiveChat().click();
        homePage.goToTheSecondWindowTab(driver, 10);
        homePage.enterMessageLiveChat().isDisplayed();
        homePage.enterMessageLiveChat().sendKeys("Hello!");
        homePage.clickBtnSend().click();
        Assert.assertEquals(homePage.answerBotLiveChat().getText(), "EatStreet Bot");
    }
}

