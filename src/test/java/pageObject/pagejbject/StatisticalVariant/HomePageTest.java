package pageObject.pagejbject.StatisticalVariant;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.pagejbject.StatisticalVariant.pages.HomePage;
import pageObject.pagejbject.StatisticalVariant.pages.InitClass;

public class HomePageTest extends InitClass {

    @Test
    public void getTitleHomePageTest() {
        Assert.assertEquals(HomePage.getTitle(driver), HomePage.expected);
    }


}
