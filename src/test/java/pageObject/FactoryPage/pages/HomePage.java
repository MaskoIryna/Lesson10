package pageObject.FactoryPage.pages;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public String expected = "Online Store | My Store1";

    public HomePage(WebDriver homePageDriver) {
        this.driver=homePageDriver;
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
