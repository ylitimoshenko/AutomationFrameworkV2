package JuliaTymoshenko.PecodeTestTask;

import ClasesToAll.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PecodeUITests extends TestInit {

    @Test
    public void testNameAndPassUserPositive() {
        PecodePage pecodePage = new PecodePage(driver);
        pecodePage.openURL();
        pecodePage.inputUserName().sendKeys("Julia");
        pecodePage.inputPassword().sendKeys("12345Yy");
        pecodePage.loginBtn().click();

        Assert.assertTrue(pecodePage.msgNoAccountFound().isDisplayed());
    }

    @Test
    public void testNameAndPassUserNegativeNumbersSigns() {
        PecodePage pecodePage = new PecodePage(driver);
        pecodePage.openURL();
        pecodePage.inputUserName().sendKeys("#132&*()");
        pecodePage.inputPassword().sendKeys("111111111");
        pecodePage.loginBtn().click();

        Assert.assertTrue(pecodePage.msgNoAccountFound().isDisplayed());
    }

    @Test
    public void tesPassUserNegative() {
        PecodePage pecodePage = new PecodePage(driver);
        pecodePage.openURL();
        pecodePage.inputUserName().sendKeys("Julia");
        pecodePage.inputPassword().sendKeys("-------------");
        pecodePage.loginBtn().click();

        Assert.assertTrue(pecodePage.msgNoAccountFound().isDisplayed());
    }

    @Test
    public void testNameAndPassUserNegativeCode() {
        PecodePage pecodePage = new PecodePage(driver);
        pecodePage.openURL();
        pecodePage.inputUserName().sendKeys("<title>Login</title>\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css\">");
        pecodePage.inputPassword().sendKeys("<image id=\"logomini\" src=\"https://pecode-");
        pecodePage.loginBtn().click();

        Assert.assertTrue(pecodePage.msgNoAccountFound().isDisplayed());
    }

    @Test
    public void testNameUserCodNegative() {
        PecodePage pecodePage = new PecodePage(driver);
        pecodePage.openURL();
        pecodePage.inputUserName().sendKeys("<title>Login</title>\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css\">");
        pecodePage.loginBtn().click();

        Assert.assertTrue(pecodePage.msgPleaseEnterPassword().isDisplayed());
    }


    @Test
    public void checkEmptyLoginFields() {
        PecodePage pecodePage = new PecodePage(driver);
        pecodePage.openURL();
        pecodePage.loginBtn().click();

        Assert.assertTrue(pecodePage.msgPleaseEnterUsername().isDisplayed());
        Assert.assertTrue(pecodePage.msgPleaseEnterPassword().isDisplayed());
    }

    @Test
    public void testNameAndPassUserNegative() {
        PecodePage pecodePage = new PecodePage(driver);
        pecodePage.openURL();
        pecodePage.inputUserName().sendKeys("bzvxjhgskjdflks");
        pecodePage.inputPassword().sendKeys("vajshgfiushf");
        pecodePage.loginBtn().click();

        Assert.assertTrue(pecodePage.msgNoAccountFound().isDisplayed());
    }
}
