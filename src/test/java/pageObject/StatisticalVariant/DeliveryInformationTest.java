package pageObject.StatisticalVariant;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.StatisticalVariant.pages.DeliveryInformationPage;
import pageObject.StatisticalVariant.pages.InitClass;

public class DeliveryInformationTest extends InitClass {

    @Test
    public void findDeliveryInformationTest() {
        DeliveryInformationPage.clickDeliveryInformationBottom(driver);
        Assert.assertEquals(DeliveryInformationPage.getDeliveryInformationTitle(driver), DeliveryInformationPage.expectedTitle);
    }
}