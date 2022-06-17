package JuliaTymoshenko.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;
import java.util.ArrayList;
import java.util.List;

public class EatstreetPage extends BasePage {

    public EatstreetPage(WebDriver driver) {
        super(driver);
    }

    public void checkAndClousePopUpWindow() {
        if (getSearchAttempt().size() > 0) {
            sleep(2);
            getSearchAttempt().get(0).click();
        }
    }
    
    public List<WebElement> getSearchAttempt() {
        return findElementsByXpath("//button[@class='btn']");
    }

    public WebElement clickBtnLiveChat() {
        return findElementByXpath("//span[@class ='ng-binding']");
    }

    public void goToTheSecondWindowTab(WebDriver driver, Integer seconds) {
        waitForNewTabOpened(seconds);
        ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void waitForNewTabOpened(Integer seconds) {
        for (int a = 0; a < seconds * 2; a++) {
            ArrayList<String> tabs2 = new ArrayList(driver.getWindowHandles());
            if (tabs2.size() > 1) {
                break;
            }
        }
    }

    public WebElement enterMessageLiveChat() {
        return findElementByXpath("//div[@id='liveAgentChatInput']/textarea");
    }

    public WebElement clickBtnSend() {
        return driver.findElement(By.xpath("//button[@title='Send']"));
    }

    public WebElement answerBotLiveChat() {
        return findElementByXpath("//div[contains(text(), 'EatStreet Bot')]");
    }

    public WebElement getAdressInput() {
        return findElementByXpath("//input[@ng-model='searchParam']");
    }

    public WebElement getFedBtn() {
        return findElementByXpath("//a[@id='find-restaurants']");
    }

    public WebElement clickSortByIMGBtn() {
        return findElementByXpath("//button[@class='custom_dropdown_button']/img");
    }

    public WebElement clickSortByRatingBtn() {
        return findElementByXpath("//button[contains(text(), 'Rating')]");
    }

    public WebElement clickSortDeliveryFreeBtn() {
        return findElementByXpath("//button[contains(text(), 'Delivery Fee')]");
    }
}
