package IraKaminska.AmazonPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ClasesToAll.BasePage;

public class HomePageA extends BasePage {
    public HomePageA(WebDriver driver) {
        super(driver);
    }

    public WebElement inputTextForSearching() {
        return driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    }

    public WebElement clickAllBtn() {
        return driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
    }

    public WebElement clickPetSuppliesBtn() {
        return driver.findElement(By.xpath("//option[contains(text(), 'Pet Supplies')]"));
    }

    public WebElement clickSearchBtn() {
        return driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
    }
}
