package pageObject.FactoryPage.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeliveryInformationPage {
    @FindBy(linkText="Delivery Information")
    private WebElement bottomDeliveryInformation;
    @FindBy(css="#box-information-links>.title")
    private WebElement titleDeliveryInformation;
    public static String expectedTitle = "Information";

    public void clickDeliveryInformationBottom() {
        bottomDeliveryInformation.click();
    }

    public String getDeliveryInformationTitle() {
        return  titleDeliveryInformation.getText();
    }
}





