package pageObject.ObjectVariant;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.ObjectVariant.pages.TermsConditionsPage;

public class TermsConditionsTest extends TestBase {
    @Test
    public void findTermsConditionsTest() {
        TermsConditionsPage termsConditionsPage = new TermsConditionsPage(driver);

        termsConditionsPage.clickTermsConditionsBottom();

        String result = termsConditionsPage.getPageContain();

        boolean infoTermsConditions = result.contains(termsConditionsPage.expectedPageContain);
        Assert.assertTrue(infoTermsConditions);

    }


}
