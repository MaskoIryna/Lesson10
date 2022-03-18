package pagejbject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class DeliveryInformationPage {
    private By bottomDeliveryInformation = By.linkText("Delivery Information");
    private By titleDeliveryInformation = By.cssSelector("#box-information-links>.title");
    public String expectedTitle = "Information";
    private WebDriver driver;

    public DeliveryInformationPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickDeliveryInformationBottom() {
        driver.findElement(bottomDeliveryInformation).click();
    }

    public String getDeliveryInformationTitle() {
        String expected = driver.findElement(titleDeliveryInformation).getText();
        return  expected;

    }
    }




