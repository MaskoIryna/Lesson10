package pageObject.pagejbject.StatisticalVariant.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TermsConditionsPage {
    private static By bottomTermsConditions = By.xpath("//*[@id='site-menu']/ul/li[5]/a");
    private static By pageContain = By.cssSelector("#main > div.middle > div.content > h1 > font > font > u");
    public static String expectedPageContain = "Условия";


    public static void clickTermsConditionsBottom(WebDriver driver) {
        driver.findElement(bottomTermsConditions).click();
    }
    public static String getPageContain(WebDriver driver) {
        return driver.findElement(pageContain).getText();
    }
}
