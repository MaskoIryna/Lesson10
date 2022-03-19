package pageObject.StatisticalVariant;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.StatisticalVariant.pages.TermsConditionsPage;

public class TermsConditionsTest extends TestBase {
    @Test
    public void findTermsConditionsTest() {

      TermsConditionsPage.clickTermsConditionsBottom(driver);
        String result = TermsConditionsPage.getPageContain(driver);
        boolean infoTermsConditions = result.contains(TermsConditionsPage.expectedPageContain);
        Assert.assertTrue(infoTermsConditions);

    }


}
