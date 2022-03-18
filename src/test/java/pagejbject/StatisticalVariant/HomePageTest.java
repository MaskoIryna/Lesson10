package pagejbject.StatisticalVariant;

import pagejbject.StatisticalVariant.pages.HomePage;
import pagejbject.StatisticalVariant.pages.InitClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends InitClass {

    @Test
    public void getTitleHomePageTest() {
        Assert.assertEquals(HomePage.getTitle(driver),HomePage.expected);
    }


}
