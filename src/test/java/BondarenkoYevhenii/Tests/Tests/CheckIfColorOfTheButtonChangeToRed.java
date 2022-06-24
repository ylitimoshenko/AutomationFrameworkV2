package BondarenkoYevhenii.Tests.Tests;

import BondarenkoYevhenii.Tests.Pages.YakabooHomePage;
import ClasesToAll.TestInit;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CheckIfColorOfTheButtonChangeToRed extends TestInit {

    @Test

    public void checkIfColorOfButtonChangeToRed(){
        YakabooHomePage yakabooHomePage = new YakabooHomePage(driver);
        Actions action = new Actions(driver);
        openUrl("https://www.yakaboo.ua/");