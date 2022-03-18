package pagejbject.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RubberDucksPage {
    private By bottomRubberDucks = By.linkText("Rubber Ducks");
    public String expectedTitle = "Rubber Ducks | My Store1";
    private WebDriver driver;

    public RubberDucksPage(WebDriver driver){
        this.driver = driver;
    }

    public  void clickRubberDucksBottom() {
        driver.findElement(bottomRubberDucks).click();
    }

    public  String getTitleRubberDucksSting() {
        return  driver.getTitle();
    }
}
