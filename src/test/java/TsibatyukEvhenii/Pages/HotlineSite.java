package TsibatyukEvhenii.Pages;

import ClasesToAll.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HotlineSite extends BasePage {
    public int numberOflistElement;

    public HotlineSite(WebDriver driver) {
        super(driver);
    }

    public static String MAIN_PAGE_ADRESS = "https://hotline.ua";
    public static String LEFT_LIST = "//*[text()='ТБ, Аудіо, Відео, Фото']";
    public static String SUB_LIST = "//a[text()=' Телевізори ']";
    public static String CHECKBOX_IN_TV_SECTIONS_FILTERS = "//div[@class='checkbox__checkmark checkbox__checkmark-plus']";
    public static String CHECKBOX_IN_TV_SECTION_SORT = "//div[@class='checkbox__checkmark']";
    public static String RESOLT_OF_SORTING = "//div[@class='list-item__photo']";


    public void goToHotlineUA() {
        driver.get(MAIN_PAGE_ADRESS);
    }

    public WebElement moveToTVsection() {
        return moveToWithExplicitWait(LEFT_LIST);
    }

    public WebElement getTVSubSection() {
        return getElementByXpath(SUB_LIST);
    }

    public List<WebElement> getCheckBox() {
        return getElementsClickAble(CHECKBOX_IN_TV_SECTIONS_FILTERS);
    }
    public List<WebElement> getSortCheckbox(){
        return getElementsClickAble(CHECKBOX_IN_TV_SECTION_SORT);
    }
    public List<WebElement> getResultFromSorting(){
        return getElementsClickAble(RESOLT_OF_SORTING);
    }









    public List<WebElement> moveToElements(String locator) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElementsByXpath(locator).get(19));
        return driver.findElements(By.xpath(locator));
    }


}
