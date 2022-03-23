package pageObject.StatisticalVariant.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObject.StatisticalVariant.Helper.Locators;

public class TermsConditionsPage {
    private static final By bottomTermsConditions = Locators.getLocator("TermsConditionsPage.bottomTermsConditions");
    private static final By pageContain = Locators.getLocator("TermsConditionsPage.pageContain");
    public static String expectedPageContain = "Условия";


    public static void clickTermsConditionsBottom(WebDriver driver) {
        driver.findElement(bottomTermsConditions).click();
    }
    public static String getPageContain(WebDriver driver) {
        return driver.findElement(pageContain).getText();
    }
}
