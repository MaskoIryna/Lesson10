package pagejbject.StatisticalVariant;
import pagejbject.StatisticalVariant.pages.InitClass;
import pagejbject.StatisticalVariant.pages.TermsConditionsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TermsConditionsTest extends InitClass {
    @Test
    public void findTermsConditionsTest() {

      TermsConditionsPage.clickTermsConditionsBottom(driver);
        String result = TermsConditionsPage.getPageContain(driver);
        boolean infoTermsConditions = result.contains(TermsConditionsPage.expectedPageContain);
        Assert.assertTrue(infoTermsConditions);

    }


}
