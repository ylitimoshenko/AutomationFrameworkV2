package AlinaLevchenko.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;
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
    //driver.swithTo().window(ChromeDriver.List.get(1));

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
        return driver.findElement(By.xpath("//span[@class='buy-button__label ng-star-inserted']"));
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

    public List<WebElement> selectChildMenu() {
        return driver.findElements(By.xpath("//a[@class='menu-categories__link']"));
    }

    public WebElement selectСreativityВevelopment() {
        return waitElementToBeClickable("//a[contains(text(),'Развитие и творчество')]");
    }

    public WebElement selectPazls() {
        return driver.findElement(By.xpath(" //span[contains(text(),'Пазлы ')]"));
    }

    public WebElement toysWithVoice() {
        return waitElementToBeClickable("//h1[contains(text(),'Соединение Голосовое')]");

    }

    public List<WebElement> blueSmartRobot() {
        return waitVisibilityOfAllElementsLocatedBy("//a[@class='goods-tile__heading ng-star-inserted']");
    }

    public WebElement redSmartRobot() {
        return waitElementToBeClickable("//*[contains(text(),'Интерактивный робот AT-Robot с голосовым управлением Красный озвучка украинская (AT001-01-UKR)')]");
    }

    public List<WebElement> greySmartRobot() {
        return waitVisibilityOfAllElementsLocatedBy("//*[contains(text(),'Умный робот AT-Robot с сенсорным управлением и обучающими карточками Белый на украинском языке (AT002-01-UKR)')]");
    }

    public WebElement searchLaptop() {
        return driver.findElement(By.xpath("//input[@name='search']"));
    }

    public WebElement laptopsLenovo() {
        return waitElementToBeClickable("//*[@class='search-suggest__item ng-star-inserted search-suggest__item_state_active']");
    }

    public List<WebElement> checkboxFilterLenovo() {
        return waitVisibilityOfAllElementsLocatedBy("//a[@class='checkbox-filter__link']");
    }

    public WebElement menuBtn() {
        return waitElementToBeClickable("//button[@id='fat-menu']");
    }

    public List<WebElement> selectAsusBtn() {
        return waitVisibilityOfAllElementsLocatedBy("//a[contains(text(),'Asus')]");
    }

    public WebElement fourCoreProcessor() {
      return  waitElementToBeClickable("//a[@data-id='14']");
    }

    public WebElement inStockBtn() {
        return waitElementToBeClickable("//a[@data-id='Есть в наличии']");
    }

    public List<WebElement> iconMenuBtn() {
        return waitVisibilityOfAllElementsLocatedBy("//*[@class='ng-tns-c94-1']");
    }

    public WebElement helpCenterBtn() {
        return waitElementToBeClickable("//a[@class='button button--large side-menu__button ng-tns-c94-1 ng-star-inserted']");
    }

    public WebElement mostRelevant() {
        return driver.findElement(By.xpath("//*[@id='title_promoted']"));

    }

    public WebElement payment() {
        return driver.findElement(By.xpath("//*[@id='title_promoted']"));
    }

    public WebElement informationAboutCargo() {
        return driver.findElement(By.xpath("//a[contains(text(),'Информация о товаре ')]"));
    }

    public WebElement bonusAccountInPremium() {
        return driver.findElement(By.xpath("//a[contains(text(),'Бонусный счёт и Premium ')]"));
    }

    public WebElement warrantyReturn() {
        return driver.findElement(By.xpath("//a[contains(text(),'Гарантия и возврат товара')]"));
    }

    public WebElement delivery() {
        return driver.findElement(By.xpath("//a[contains(text(),'Доставка ')]"));
    }

    public WebElement helpsInOrder() {
        return driver.findElement(By.xpath("//a[contains(text(),'Помощь по заказу')]"));
    }

    public WebElement websitePersonalAccount() {
        return driver.findElement(By.xpath("//a[contains(text(),'Сайт и личный кабинет ')]"));
    }

    public WebElement otherSellers() {
        return driver.findElement(By.xpath("//a[contains(text(),'Другие продавцы')]"));
    }

    public WebElement overflowBtn() {
       return waitElementToBeClickable("//body[@style='overflow-anchor:none;']");
    }

    public WebElement catsBtn() {
        return waitElementToBeClickable("//a[@data-id='44 Cats']");
    }

    public WebElement selectcatalog() {
        return waitElementToBeClickable(" //button[contains(text(),'Каталог')]");
    }

    public List<WebElement> menuicon() {
        return waitVisibilityOfAllElementsLocatedBy("//span[@class='menu-categories__icon']");
    }

    public WebElement toysForBeach() {
        return waitElementToBeClickable(" //a[contains(text(),'Игрушки для пляжа, песочницы')]");
    }

    public WebElement organizeForBath() {
        return waitElementToBeClickable("//*[@style='overflow-anchor:none;']");
    }

    public WebElement nadyvnieKresla() {
        return  waitElementToBeClickable("//a[@data-id='Надувное кресло']");

    }

    public WebElement nadyvnueBaseyny() {
        return waitElementToBeClickable("//a[@data-id='Надувные бассейны']");
    }

    public WebElement igrushkiDlyaVannuPlyagha() {
        return waitElementToBeClickable("//h1[contains(text(),'Игрушки для пляжа, песочницы и ванной')]");
    }
}
