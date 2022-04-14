package NazarukBogdan.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {super(driver);}

    public WebElement getCareersBtn() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Careers')]"));
    }

    public WebElement getGoItBtn() {
        return driver.findElement(By.xpath("//button[contains(text(), 'Got it')]"));
    }

    public WebElement getAllJobs() {
        return driver.findElement(By.xpath("//h2[contains(text(), 'All Jobs')]"));
    }

    public WebElement getBlogBtn() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Blog')]"));
    }
}
