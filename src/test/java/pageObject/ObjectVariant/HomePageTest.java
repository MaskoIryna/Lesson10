package pageObject.ObjectVariant;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.ObjectVariant.pages.HomePage;

public class HomePageTest extends TestBase {

    @Test
    public void getTitleHomePageTest() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getTitle(),homePage.expected);
    }


}