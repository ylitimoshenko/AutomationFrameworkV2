package IraKaminska.AmazonPage;

import org.openqa.selenium.WebDriver;
import pageobject.BasePage;

public class PetSuppliesPage extends BasePage {
    public PetSuppliesPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkURLAdressPetSupplies() {
        return driver.getCurrentUrl().contains("pets-intl-ship");
    }

}
