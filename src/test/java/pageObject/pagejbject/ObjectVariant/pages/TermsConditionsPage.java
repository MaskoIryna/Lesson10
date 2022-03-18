package pageObject.pagejbject.ObjectVariant.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TermsConditionsPage {
    private By bottomTermsConditions = By.xpath("//*[@id='site-menu']/ul/li[5]/a");
    private By pageContain = By.cssSelector("#main > div.middle > div.content > h1 > font > font > u");
    public String expectedPageContain = "Условия";
    private WebDriver driver;

    public TermsConditionsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickTermsConditionsBottom() {
        driver.findElement(bottomTermsConditions).click();
    }
    public String getPageContain() {
        return driver.findElement(pageContain).getText();
    }
}
