package pageObject.pagejbject.ObjectVariant.pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
    public String expected = "Online Store | My Store1";
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public String getTitle() {
        String actual = driver.getTitle();
        return actual;
    }


}
