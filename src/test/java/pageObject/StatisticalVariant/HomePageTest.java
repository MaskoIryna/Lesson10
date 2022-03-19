package pageObject.StatisticalVariant;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.StatisticalVariant.pages.HomePage;

public class HomePageTest extends TestBase {

    @Test
    public void getTitleHomePageTest() {
        Assert.assertEquals(HomePage.getTitle(driver), HomePage.expected);
    }


}
