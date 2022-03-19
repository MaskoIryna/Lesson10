package pageObject.FactoryPage.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TermsConditionsPage {
    @FindBy( xpath = "//*[@id='site-menu']/ul/li[5]/a")
    private WebElement bottomTermsConditions;
    @FindBy( css = "#main > div.middle > div.content > h1 > font > font > u")
    private WebElement pageContain;
    public static String expectedPageContain = "Условия";

    public void clickTermsConditionsBottom() {
        bottomTermsConditions.click();
    }
    public String getPageContain() {
        return pageContain.getText();
    }
}
