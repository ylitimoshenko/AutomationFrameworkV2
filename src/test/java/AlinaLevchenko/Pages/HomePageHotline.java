package AlinaLevchenko.Pages;
import ClasesToAll.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class HomePageHotline extends BasePage{

        public WebElement getElementByXpath(String Locator) {
            int BASIC_TIME = 15;
            WebDriverWait wait = new WebDriverWait(driver, BASIC_TIME);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator)));
            return driver.findElement(By.xpath(Locator));
        }
        public HomePageHotline(WebDriver driver){
            super(driver);}

        public WebElement catalogTovaBtn() {
            return driver.findElement(By.xpath("//span[@class='uppercase']"));
        }

        public List<WebElement> menuAvtoMoto() {
            return driver.findElements(By.xpath("//a[@class='menu-main-link']"));
        }

        public List<WebElement> selectMotocukluSkyteruAvto() {
            return driver.findElements(By.xpath("//a[contains(text(),'Мотоцикли, скутери, автомобілі')]"));
        }

        public WebElement motocukluSkyteru() {
            return driver.findElement(By.xpath("//div[contains(text(),'Мотоцикли, скутери')]"));

        }

        public List<WebElement> horwinCr6Btn() {
            return driver.findElements(By.xpath("//a[@data-tracking-id='catalog-10']"));
        }

        public WebElement zakrutuisholom() {
            return waitElementToBeClickable("//h1[contains(text(),'Закритий шолом-інтеграл LS2 FF353')]");
        }
    }



