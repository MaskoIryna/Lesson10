package pagejbject;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagejbject.pages.DeliveryInformationPage;
import pagejbject.pages.InitClass;

public class DeliveryInformationTest extends InitClass {

    @Test
    public void findDeliveryInformation() {
        DeliveryInformationPage deliveryInformationPage = new DeliveryInformationPage(driver);

        deliveryInformationPage.clickDeliveryInformationBottom();
        Assert.assertEquals(deliveryInformationPage.actualTitle,deliveryInformationPage.getDeliveryInformationTitle());
    }
}