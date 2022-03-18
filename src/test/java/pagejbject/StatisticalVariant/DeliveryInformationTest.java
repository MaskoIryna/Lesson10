package pagejbject.StatisticalVariant;
import pagejbject.StatisticalVariant.pages.DeliveryInformationPage;
import pagejbject.StatisticalVariant.pages.InitClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeliveryInformationTest extends InitClass {

    @Test
    public void findDeliveryInformationTest() {
        DeliveryInformationPage.clickDeliveryInformationBottom(driver);
        Assert.assertEquals(DeliveryInformationPage.getDeliveryInformationTitle(driver), DeliveryInformationPage.expectedTitle);
    }
}