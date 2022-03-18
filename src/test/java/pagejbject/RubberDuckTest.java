package pagejbject;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagejbject.pages.InitClass;
import pagejbject.pages.RubberDucksPage;

public class RubberDuckTest extends InitClass{

    @Test
    public void findRubberDucksTest() {
        RubberDucksPage rubberDucksPage = new RubberDucksPage(driver);

        rubberDucksPage.clickRubberDucksBottom();
        Assert.assertEquals(rubberDucksPage.getTitleRubberDucksSting(),rubberDucksPage.expectedTitle);
    }
}
