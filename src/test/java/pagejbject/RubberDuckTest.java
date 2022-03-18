package pagejbject;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagejbject.pages.InitClass;
import pagejbject.pages.RubberDucksPage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RubberDuckTest extends InitClass{

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
