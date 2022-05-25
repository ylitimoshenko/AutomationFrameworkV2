package KovalchukVlad.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class ApiPage extends BasePage {
    public ApiPage(WebDriver driver) {
        super(driver);
    }

    public void goToIframe() {
        WebElement iframe = driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/e/1FAIpQLSct2JE5-tkmeqE7j8sUY-_jJPm5gZBZ-_1McCglDL4_qa_Ifw/viewform?embedded=true']"));
        driver.switchTo().frame(iframe);
    }

    public WebElement searchTextApi() {
        return findElementByXpath("//div[contains(text(), 'EatStreet API Updates')]");
    }
}
