package pageObject.StatisticalVariant.pages;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public static String expected = "Online Store | My Store1";

    public static String getTitle(WebDriver driver) {

        return driver.getTitle();
    }


}
