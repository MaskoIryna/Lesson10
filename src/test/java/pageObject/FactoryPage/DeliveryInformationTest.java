package pageObject.FactoryPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.FactoryPage.pages.DeliveryInformationPage;
import pageObject.FactoryPage.pages.InitClass;

public class DeliveryInformationTest extends InitClass {

    @Test
    public void findDeliveryInformationTest() {
        DeliveryInformationPage deliveryInformationPage = PageFactory.initElements(driver,DeliveryInformationPage.class);
        deliveryInformationPage.clickDeliveryInformationBottom();

        Assert.assertEquals(deliveryInformationPage.getDeliveryInformationTitle(),
                DeliveryInformationPage.expectedTitle);
    }
}