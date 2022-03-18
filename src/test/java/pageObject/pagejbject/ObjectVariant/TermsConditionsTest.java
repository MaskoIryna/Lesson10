package pageObject.pagejbject.ObjectVariant;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.pagejbject.ObjectVariant.pages.InitClass;
import pageObject.pagejbject.ObjectVariant.pages.TermsConditionsPage;

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
