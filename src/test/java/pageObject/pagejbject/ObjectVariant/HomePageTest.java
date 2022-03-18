package pageObject.pagejbject.ObjectVariant;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.pagejbject.ObjectVariant.pages.HomePage;
import pageObject.pagejbject.ObjectVariant.pages.InitClass;

public class HomePageTest extends InitClass {

    @Test
    public void getTitleHomePageTest() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getTitle(),homePage.expected);
    }


}
