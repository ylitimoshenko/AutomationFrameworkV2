package TsibatyukEvhenii.Tests;

import ClasesToAll.TestInit;
import TsibatyukEvhenii.Pages.RetroMagaz;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class BuyXboxTest extends TestInit {


    @Test
    public void buyXbox(){
        RetroMagaz RM = new RetroMagaz(driver);
        RM.goToRetroMagaz();
        RM.moveToXboxBtn();





    }
}
