package AlinaLevchenko.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.BasePage;
import java.util.List;

public class RozetkaHomePage extends BasePage {
    public RozetkaHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getElementByXpath(String Locator) {
        int BASIC_TIME = 15;
        WebDriverWait wait = new WebDriverWait(driver, BASIC_TIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator)));
        return driver.findElement(By.xpath(Locator));
    }

    public WebElement findElementByXpath(String locator) {
        return waitElementToBeClickable(locator);
    }

    public List<WebElement> munuCategories() {
        return driver.findElements(By.xpath("//a[@class='menu-categories__link']"));
    }

    public List<WebElement> selectLaptop() {
        return driver.findElements(By.xpath("//a[contains(text(),'Ноутбуки')]"));
    }

    public List<WebElement> selectLaptopAcerAspire() {
        return driver.findElements(By.xpath("//span[@class='goods-tile__title']"));
    }

    public WebElement putInBasket() {
        return driver.findElement(By.xpath("//span[contains(text(),' Купить ')]"));
    }

    public WebElement placeOnOrder() {
        return driver.findElement(By.xpath("//a[contains(text(),'Оформить заказ ')]"));
    }

    public WebElement ordering() {
        return driver.findElement(By.xpath(" //h1[contains(text(),'Оформление заказа ')]"));
    }

    public List<WebElement> selectMunuCategories() {
        return waitVisibilityOfAllElementsLocatedBy("//a[@class='menu-categories__link']");
    }

    public List<WebElement> tileDogs() {
        return waitVisibilityOfAllElementsLocatedBy("//a[@class='tile-cats__heading ng-star-inserted']");
    }

    public List<WebElement> selectfeedForDog() {
        return driver.findElements(By.xpath("//a[contains(text(),' Корм' )]"));

    }

    public WebElement showMore() {
        return waitElementToBeClickable("//span[@class='show-more__text']");
    }

    public WebElement feedForBulldog() {
        return waitElementToBeClickable("//span[contains(text(),'Сухой полнорационный корм для взрослых собак породы Французский бульдог Royal Canin French Bulldog Adult в возрасте от 12 месяцев 3 кг (3182550811637) ')]");
    }

    public WebElement productCharacteristics() {
        return waitElementToBeClickable("//a[contains(text(),' Характеристики ')]");
    }

    public WebElement buyInCreditBtn() {
        return waitElementToBeClickable("//button[contains(text(),'Купить в кредит ')]");

    }

    public List<WebElement> selectOnFourPartsBtn() {
        return waitVisibilityOfAllElementsLocatedBy("//button[contains(text(),' Выбрать ')]");
    }

    public WebElement orderingBuy() {
        return waitElementToBeClickable("//h1[contains(text(),' Оформление заказа')]");
    }
}