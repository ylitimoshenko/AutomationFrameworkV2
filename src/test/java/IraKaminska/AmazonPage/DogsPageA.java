package IraKaminska.AmazonPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class DogsPageA extends BasePage {
    public DogsPageA (WebDriver driver) {
        super(driver);
    }

    public WebElement clickDogApparelAccessories() {
        return driver.findElement(By.xpath("//span[text()= 'Apparel & Accessories']"));
    }

    public WebElement clickDogApparelCostumes() {
        return driver.findElement(By.xpath("//span[text()= 'Costumes']"));
    }

    public WebElement clickDogApparelAccessoriesSizeS() {
        return driver.findElement(By.xpath("//span[text()= 'S']"));
    }

    public boolean checkURLdogs() {
        return driver.getCurrentUrl().contains("pets-intl-ship&bbn=16225013011&rh");
    }

    public WebElement clickDogToys() {
        return driver.findElement(By.xpath("//span[text()= 'Toys']"));
    }

    public WebElement clickDogChewToys() {
        return driver.findElement(By.xpath("//span[text()= 'Chew Toys']"));
    }

    public WebElement clickDogPlasticChewToys() {
        return driver.findElement(By.xpath("//span[text()= 'Plastic']"));
    }

    public boolean checkURLDogPlasticChewToys() {
        return driver.getCurrentUrl().contains("Cp_n_material_browse");
    }

    public WebElement clickDogFood() {
        return driver.findElement(By.xpath("//span[text()= 'Food']"));
    }

    public WebElement clickDogWetFoodBtn() {
        return driver.findElement(By.xpath("//span[text()= 'Wet']"));
    }

    public WebElement clickAdultDogFoodBtn() {
        return driver.findElement(By.xpath("//span[text()= 'Adult']"));
    }

    public WebElement clickAllNaturalFoodBtn() {
        return driver.findElement(By.xpath("//span[text()= 'All Natural']"));
    }

    public boolean checkURLAdultDogWetFoodAllNatural() {
        return driver.getCurrentUrl().contains("sr_nr_p_n_feature_three");
    }

    public WebElement clickDogTreatsBtn() {
        return driver.findElement(By.xpath("//span[text()= 'Treats']"));
    }

    public boolean checkURLDogTreats() {
        return driver.getCurrentUrl().contains("sr_nr_n_2");
    }

    public WebElement clickDogGroomingBtn() {
        return driver.findElement(By.xpath("//span[text()= 'Grooming']"));
    }

    public WebElement clickUpto25Btn() {
        return driver.findElement(By.xpath("//span[text()= 'Up to $25']"));
    }

    public WebElement clickDogGroomingColonesBtn() {
        return driver.findElement(By.xpath("//span[text()= 'Colognes']"));
    }

    public boolean checkURLDogGroomingColognes() {
        return driver.getCurrentUrl().contains("pets-intl-ship&bbn");
    }
}
