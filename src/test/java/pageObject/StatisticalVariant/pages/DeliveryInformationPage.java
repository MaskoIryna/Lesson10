package pageObject.StatisticalVariant.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObject.StatisticalVariant.Helper.Locators;


public class DeliveryInformationPage {
    private static final By bottomDeliveryInformation = Locators.getLocator("DeliveryInformationPage.bottomDeliveryInformation");
    private static final By titleDeliveryInformation =Locators.getLocator("DeliveryInformationPage.titleDeliveryInformation");
    public static String expectedTitle = "Information";


    public static void clickDeliveryInformationBottom(WebDriver driver) {
        driver.findElement(bottomDeliveryInformation).click();
    }

    public static String getDeliveryInformationTitle(WebDriver driver) {
        return  driver.findElement(titleDeliveryInformation).getText();

    }
    }




