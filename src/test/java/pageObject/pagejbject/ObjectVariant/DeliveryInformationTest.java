package pageObject.pagejbject.ObjectVariant;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.pagejbject.ObjectVariant.pages.DeliveryInformationPage;
import pageObject.pagejbject.ObjectVariant.pages.InitClass;

public class DeliveryInformationTest extends InitClass {

    @Test
    public void findDeliveryInformationTest() {
        DeliveryInformationPage deliveryInformationPage = new DeliveryInformationPage(driver);

        deliveryInformationPage.clickDeliveryInformationBottom();
        Assert.assertEquals(deliveryInformationPage.getDeliveryInformationTitle(),deliveryInformationPage.expectedTitle);
    }
}