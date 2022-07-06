package VolodymyrHrytsiuk.Pages;

import ClasesToAll.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageC extends BasePage {
    public HomePageC(WebDriver driver) {
        super(driver);
    }
    public WebElement selectProfessionalsTitle(){
        return driver.findElement(By.xpath("//a[@id='mnb_professionals']"));
    }
    public WebElement selectJobTitlePartner() {
        return driver.findElement(By.xpath("//option[text()='Partner']"));
    }
    public WebElement selectOffice() {
        return driver.findElement(By.xpath("//select[@id='office']"));
    }
    public WebElement selectOfficeBrussels(){
        return driver.findElement(By.xpath("//select[@id='office']/option[text()='Brussels']"));
    }
    public WebElement selectPracticeAdverAndMedia(){
        return driver.findElement(By.xpath("//select[@id='practice']/option[2]"));
    }
    public WebElement selectIndustryAeroAndDef(){
        return driver.findElement(By.xpath("//select[@id='industry']/option[text()='Aerospace & Defense']"));
    }
    public WebElement selectLawSchoolAlbanyLS(){
        return driver.findElement(By.xpath("//select[@id='school']/option[text()='Albany Law School']"));
    }
    public WebElement selectLandLanguageSwedish(){
        return driver.findElement(By.xpath("//select[@id='lang']/option[text()='Swedish']"));
    }
    public WebElement selectBarAdmissionsCalifornia(){
        return driver.findElement(By.xpath("//select[@id='adm']/option[text()='California']"));
    }
    public WebElement selectGovernmentExperienceBankrupcyCourt(){
        return driver.findElement(By.xpath("//select[@id='govtexp']/option[text()='Bankruptcy Court']"));
    }
    public WebElement professionalSearchButton(){
        return driver.findElement(By.xpath("//button[@id= 'professionalsSearchButton']"));
    }
    public WebElement searshResultIs0(){
        return driver.findElement(By.xpath("//div[text()='0 result']"));
    }
    public WebElement acceptAllCookiesButton(){
        return driver.findElement(By.xpath("//button[@id= 'onetrust-accept-btn-handler']"));
    }
}

