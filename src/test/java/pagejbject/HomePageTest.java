package pagejbject;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagejbject.pages.HomePage;
import pagejbject.pages.InitClass;

public class HomePageTest extends InitClass {

    @Test
    public void getTitleHomePage() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.actual,homePage.getTitle());
    }


}
