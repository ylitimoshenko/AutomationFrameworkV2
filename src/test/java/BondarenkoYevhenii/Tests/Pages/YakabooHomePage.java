package BondarenkoYevhenii.Tests.Pages;

import ClasesToAll.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class YakabooHomePage extends BasePage {
    public YakabooHomePage(WebDriver driver) {
        super(driver);
    }

    public static final String ABOUT_BTN = "//a[text()='Про Yakaboo']";
    public WebElement aboutBtn(){ return findElementByXpath(ABOUT_BTN);}





}

