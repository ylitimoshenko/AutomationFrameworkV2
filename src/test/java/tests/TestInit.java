package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {

    public WebDriver driver;
    ChromeOptions options = new ChromeOptions();

    //    put false here if you want to see browser)
    boolean headless = false;


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        options.setHeadless(headless);
        driver = new ChromeDriver(options);
        if (headless) {
            driver.manage().window().setSize(new Dimension(1920, 1200));
        } else {
            driver.manage().window().maximize();
        }
    }

//    @AfterMethod
//    public void afterMethod() {
//        driver.quit();
//    }


    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void openUrl(String site) {
        driver.get(site);
    }

    public void fullscreen() {
        driver.manage().window().maximize();
    }

    int BASIC_TIME = 15;

    public void waitTILLELelementContainsText(String locator, String text) {
        WebDriverWait wait = new WebDriverWait(driver, BASIC_TIME);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(locator), text));
    }

    public WebElement getElementByXpath(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, BASIC_TIME);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }
}
