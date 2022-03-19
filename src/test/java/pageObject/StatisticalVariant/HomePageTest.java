package pageObject.StatisticalVariant;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.StatisticalVariant.pages.HomePage;
import pageObject.StatisticalVariant.pages.InitClass;

public class HomePageTest extends InitClass {

    @Test
    public void getTitleHomePageTest() {
        Assert.assertEquals(HomePage.getTitle(driver), HomePage.expected);
    }


}
