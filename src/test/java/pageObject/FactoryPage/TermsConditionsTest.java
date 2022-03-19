package pageObject.FactoryPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.FactoryPage.pages.InitClass;
import pageObject.FactoryPage.pages.TermsConditionsPage;

public class TermsConditionsTest extends InitClass {
    @Test
    public void findTermsConditionsTest() {
        TermsConditionsPage termsConditions = PageFactory.initElements(driver, TermsConditionsPage.class);

        termsConditions.clickTermsConditionsBottom();

        String result = termsConditions.getPageContain();
        boolean infoTermsConditions = result.contains(TermsConditionsPage.expectedPageContain);

        Assert.assertTrue(infoTermsConditions);

    }


}
