package pageObject.StatisticalVariant;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.StatisticalVariant.pages.RubberDucksPage;

public class RubberDuckTest extends TestBase {

    @Test
    public void findRubberDucksTest() {
        RubberDucksPage.clickRubberDucksBottom(driver);
        Assert.assertEquals(RubberDucksPage.getTitleRubberDucksSting(driver), RubberDucksPage.expectedTitleRD);
    }

    @Test
    public void findElementSubcategoryTest() {
        RubberDucksPage.findElementSubcategoryGetTitle(driver);
        Assert.assertEquals( RubberDucksPage.findElementSubcategoryGetTitle(driver), RubberDucksPage.expectedTitleSubcategory);
    }

    @Test
    public void clickNameAndSortTest() {
        RubberDucksPage.clickRubberDucksBottom(driver);
        Assert.assertTrue(RubberDucksPage.clickNameAndSort(driver));
    }
    @Test
    public void findElementSaleRubberDucksTest() {
        Assert.assertTrue(RubberDucksPage.findElementSaleRubberDucks(driver));
    }
    @Test
    public void clickPriceAndSortRubberDucksPageTest() {
        Assert.assertTrue(RubberDucksPage.clickPriceAndSortRubberDucksPage(driver));

    }
    @Test
    public void greenDuckNewElementTest() {
        Assert.assertTrue(RubberDucksPage.greenDuckNewElementTest(driver));
    }

}
