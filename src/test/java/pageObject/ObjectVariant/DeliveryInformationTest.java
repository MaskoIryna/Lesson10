package pageObject.ObjectVariant;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.ObjectVariant.pages.DeliveryInformationPage;

public class DeliveryInformationTest extends TestBase {

    @Test
    public void findDeliveryInformationTest() {
        DeliveryInformationPage deliveryInformationPage = new DeliveryInformationPage(driver);

        deliveryInformationPage.clickDeliveryInformationBottom();
        Assert.assertEquals(deliveryInformationPage.getDeliveryInformationTitle(),deliveryInformationPage.expectedTitle);
    }
}