package pagejbject.ObjectVariant;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagejbject.ObjectVariant.pages.InitClass;
import pagejbject.ObjectVariant.pages.TermsConditionsPage;

public class TermsConditionsTest extends InitClass {
    @Test
    public void findTermsConditionsTest() {
        TermsConditionsPage termsConditionsPage = new TermsConditionsPage(driver);

        termsConditionsPage.clickTermsConditionsBottom();

        String result = termsConditionsPage.getPageContain();

        boolean infoTermsConditions = result.contains(termsConditionsPage.expectedPageContain);
        Assert.assertTrue(infoTermsConditions);

    }


}
