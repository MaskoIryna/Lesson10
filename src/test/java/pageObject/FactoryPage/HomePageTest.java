package pageObject.FactoryPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.FactoryPage.pages.HomePage;
import pageObject.FactoryPage.pages.InitClass;

    public class HomePageTest extends InitClass {

    @Test
    public void getTitleHomePageTest() {
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);

        Assert.assertEquals(homePage.getTitle(), homePage.expected);
    }
}
