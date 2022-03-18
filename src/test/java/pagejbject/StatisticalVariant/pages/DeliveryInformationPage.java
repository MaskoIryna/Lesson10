package pagejbject.StatisticalVariant.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class DeliveryInformationPage {
    private static By bottomDeliveryInformation = By.linkText("Delivery Information");
    private static By titleDeliveryInformation = By.cssSelector("#box-information-links>.title");
    public static String expectedTitle = "Information";


    public static void clickDeliveryInformationBottom(WebDriver driver) {
        driver.findElement(bottomDeliveryInformation).click();
    }

    public static String getDeliveryInformationTitle(WebDriver driver) {
        String expected = driver.findElement(titleDeliveryInformation).getText();
        return  expected;

    }
    }




