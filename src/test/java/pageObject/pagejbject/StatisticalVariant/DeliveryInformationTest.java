package pageObject.pagejbject.StatisticalVariant;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.pagejbject.StatisticalVariant.pages.DeliveryInformationPage;
import pageObject.pagejbject.StatisticalVariant.pages.InitClass;

public class DeliveryInformationTest extends InitClass {

    @Test
    public void findDeliveryInformationTest() {
        DeliveryInformationPage.clickDeliveryInformationBottom(driver);
        Assert.assertEquals(DeliveryInformationPage.getDeliveryInformationTitle(driver), DeliveryInformationPage.expectedTitle);
    }
}