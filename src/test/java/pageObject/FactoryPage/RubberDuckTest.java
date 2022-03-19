package pageObject.FactoryPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.FactoryPage.pages.RubberDucksPage;

public class RubberDuckTest extends TestBase{

    @Test
    public void findRubberDucksTest() {
        RubberDucksPage rubberDucksPage = PageFactory.initElements(driver,RubberDucksPage.class);
        rubberDucksPage.clickRubberDucksBottom();
        Assert.assertEquals(rubberDucksPage.getTitleRubberDucksSting(),rubberDucksPage.expectedTitleRD );
    }

    @Test
    public void findElementSubcategoryTest() {
        RubberDucksPage rubberDucksPage = PageFactory.initElements(driver,RubberDucksPage.class);
        rubberDucksPage.findElementSubcategoryGetTitle();
        Assert.assertEquals( rubberDucksPage.findElementSubcategoryGetTitle(), rubberDucksPage.expectedTitleSubcategory);
    }

    @Test
    public void clickNameAndSortTest() {
        RubberDucksPage rubberDucksPage = PageFactory.initElements(driver,RubberDucksPage.class);
        rubberDucksPage.clickRubberDucksBottom();
        Assert.assertTrue(rubberDucksPage.clickNameAndSort());
    }
    @Test
    public void findElementSaleRubberDucksTest() {
        RubberDucksPage rubberDucksPage = PageFactory.initElements(driver,RubberDucksPage.class);
        Assert.assertTrue(rubberDucksPage.findElementSaleRubberDucks());
    }
    @Test
    public void clickPriceAndSortRubberDucksPageTest() {
        RubberDucksPage rubberDucksPage = PageFactory.initElements(driver,RubberDucksPage.class);
        Assert.assertTrue(rubberDucksPage.clickPriceAndSortRubberDucksPage());
    }
    @Test
    public void greenDuckNewElementTest() {
        RubberDucksPage rubberDucksPage = PageFactory.initElements(driver,RubberDucksPage.class);
        Assert.assertTrue(rubberDucksPage.greenDuckNewElementTest());
    }
}
