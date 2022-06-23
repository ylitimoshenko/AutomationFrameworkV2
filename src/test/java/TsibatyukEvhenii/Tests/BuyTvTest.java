package TsibatyukEvhenii.Tests;

import ClasesToAll.TestInit;
import TsibatyukEvhenii.Pages.HotlineSite;
import org.testng.annotations.Test;

public class BuyTvTest extends TestInit {
    @Test
    public void hotline() {
        HotlineSite hotlineSite = new HotlineSite(driver);
        hotlineSite.goToHotlineUA();
        hotlineSite.moveToTVsection();
        hotlineSite.getTVSubSection().click();
        hotlineSite.getSortCheckbox().get(0).click();
        hotlineSite.getCheckBox().get(0).click();
        hotlineSite.getCheckBox().get(1).click();
        hotlineSite.getCheckBox().get(85).click();
        hotlineSite.getCheckBox().get(11).click();
        sleep(3);
        hotlineSite.getResultFromSorting().get(0).click();





    }

}
