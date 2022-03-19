package pageObject.ObjectVariant;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.ObjectVariant.pages.InitClass;
import pageObject.ObjectVariant.pages.RubberDucksPage;

public class RubberDuckTest extends TestBase {

    @Test
    public void findRubberDucksTest() {
        RubberDucksPage rubberDucksPage = new RubberDucksPage(driver);

        rubberDucksPage.clickRubberDucksBottom();
        Assert.assertEquals(rubberDucksPage.getTitleRubberDucksSting(),rubberDucksPage.expectedTitleRD);
    }

    @Test
    public void findElementSubcategoryTest() {
        RubberDucksPage rubberDucksPage = new RubberDucksPage(driver);
        rubberDucksPage.findElementSubcategoryGetTitle();

        Assert.assertEquals( rubberDucksPage.findElementSubcategoryGetTitle(),rubberDucksPage.expectedTitleSubcategory);
    }

    @Test
    public void clickNameAndSortTest() {
        RubberDucksPage rubberDucksPage = new RubberDucksPage(driver);
        rubberDucksPage.clickRubberDucksBottom();

        Assert.assertTrue(rubberDucksPage.clickNameAndSort());
    }
    @Test
    public void findElementSaleRubberDucksTest() {
        RubberDucksPage rubberDucksPage = new RubberDucksPage(driver);
        Assert.assertTrue(rubberDucksPage.findElementSaleRubberDucks());
    }
    @Test
    public void clickPriceAndSortRubberDucksPageTest() {
        RubberDucksPage rubberDucksPage = new RubberDucksPage(driver);
        Assert.assertTrue(rubberDucksPage.clickPriceAndSortRubberDucksPage());

    }
    @Test
    public void greenDuckNewElementTest() {
        RubberDucksPage rubberDucksPage = new RubberDucksPage(driver);
        Assert.assertTrue(rubberDucksPage.greenDuckNewElementTest());

    }




}
