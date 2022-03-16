package pagejbject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RubberDucksPage {
    private By bottomRubberDucks = By.linkText("Rubber Ducks");

    private WebDriver driver;

    public RubberDucksPage(WebDriver driver) {
        this.driver = this.driver;
    }
    public  void clickRubberDucksBottom() {
        driver.findElement(bottomRubberDucks).sendKeys(Keys.ENTER);
    }

    public  String getTitleRubberDucksSting() {
        return  driver.getTitle();
    }








}
