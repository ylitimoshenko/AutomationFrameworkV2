package DubrovskiyVlad.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobject.BasePage;

public class BlogPage extends BasePage {
    public BlogPage(WebDriver driver) {
        super(driver);
    }

    public WebElement recentPosts() {
      return findElementByXpath("//h2[contains(text(), 'Recent Posts')]");
    }
}
