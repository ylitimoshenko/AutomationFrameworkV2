package JuliaTymoshenko.EatStreet.Tests;

import ClasesToAll.TestInit;
import JuliaTymoshenko.Pages.EatstreetPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LiveChat extends TestInit {

    @Test
    public void livechat() {
        EatstreetPage homePage = new EatstreetPage(driver);
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

