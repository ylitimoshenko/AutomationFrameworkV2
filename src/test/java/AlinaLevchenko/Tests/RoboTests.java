package AlinaLevchenko.Tests;
import AlinaLevchenko.Pages.HomePageRobo;
import org.testng.annotations.Test;
import tests.TestInit;

public class RoboTests extends TestInit {
    @Test
    public void signUpOnOpenLesson(){
        HomePageRobo homePageRobo = new HomePageRobo(driver);
        openUrl("https://robocode.ua/");
        homePageRobo.selectFreelesson().get(0).click();

    }
}





