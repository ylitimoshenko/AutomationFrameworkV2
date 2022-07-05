package VolodymyrHrytsiuk.Tests;

import ClasesToAll.TestInit;
import VolodymyrHrytsiuk.Pages.HomePageC;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrowellTests extends TestInit {
    @Test
    public void checkProfessionals() {
        HomePageC homePageCrw = new HomePageC(driver);
        openUrl("https://www.crowell.com/");
        homePageCrw.selectProfessionalsTitle().click();
        homePageCrw.selectJobTitlePartner().click();
        homePageCrw.selectOffice().click();
        homePageCrw.selectOfficeBrussels().click();
        homePageCrw.selectPracticeAdverAndMedia().click();
        homePageCrw.selectIndustryAeroAndDef().click();
        homePageCrw.selectLawSchoolAlbanyLS().click();
        homePageCrw.selectLandLanguageSwedish().click();
        homePageCrw.selectBarAdmissionsCalifornia().click();
        homePageCrw.selectGovernmentExperienceBankrupcyCourt().click();
        homePageCrw.acceptAllCookiesButton().click();
        homePageCrw.professionalSearchButton().click();

        Assert.assertTrue(homePageCrw.searshResultIs0().isDisplayed());
    }
}
