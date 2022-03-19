package pageObject.FactoryPage.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RubberDucksPage extends InitClass{
    WebDriver driver;
    @FindBy(linkText = "Rubber Ducks" )
    private WebElement bottomRubberDucks;
    @FindBy(linkText = "Subcategory")
    private WebElement elementSubcategory;
    @FindBy(xpath = "//img[@alt='Yellow Duck']/following-sibling::div")
    private WebElement elementSale;
    @FindBy(xpath = "//div[@class='name']")
    private List<WebElement> locatorElementRD_Name;
    @FindBy (xpath = "//span[@class='price']")
    private List<WebElement> locatorElementPrice;
    @FindBy (xpath = "//a[@class='link'][@title='Green DucK']")
    private WebElement locatorGreenDuck;
    @FindBy (xpath = "//*[contains(text(),'Price')]")
    private WebElement locatorTextPrice;
    @FindBy (xpath = "//*[contains(text(),'Name')]")
    private WebElement elementRD_NameClick;
    public String expectedTitleRD = "Rubber Ducks | My Store1";
    public String expectedTitleSubcategory = "Subcategory | My Store1";

    public RubberDucksPage(WebDriver rubberDucksPageDriver) {
        this.driver=rubberDucksPageDriver;
    }

    public void clickRubberDucksBottom() {
        bottomRubberDucks.click();
    }

    public String getTitleRubberDucksSting() {
        return driver.getTitle();
    }

    public String findElementSubcategoryGetTitle() {
        Actions builder = new Actions(driver);
        builder.moveToElement(bottomRubberDucks).perform();
        builder.moveToElement(elementSubcategory).click().perform();
        return driver.getTitle();
    }
    public boolean clickNameAndSort() {
        bottomRubberDucks.click();
        ArrayList<String> actual = new ArrayList<>();
        ArrayList<String> expected = new ArrayList<>();

//List before click "NAME" & sort
        List<WebElement> elements = locatorElementRD_Name;
        for (WebElement counter : elements) {
            expected.add(counter.getText());
        }
        Collections.sort(expected);
//List after click "Name"
        elementRD_NameClick.click();
        List<WebElement> elementsAfterClick = locatorElementRD_Name;
        for (WebElement counter : elementsAfterClick) {
            actual.add(counter.getText());
        }
        return  actual.equals(expected);
    }

    public boolean findElementSaleRubberDucks() {
        new Actions(driver).moveToElement(bottomRubberDucks).perform();

        new Actions(driver).moveToElement(elementSubcategory).click().perform();

        return elementSale.getText().contains("SALE");

    }
    public boolean clickPriceAndSortRubberDucksPage() {
        bottomRubberDucks.click();
        ArrayList<Float> actual = new ArrayList<>();
        ArrayList<Float> expected = new ArrayList<>();
//List before click "Price"
        List<WebElement> priceBeforeClick = locatorElementPrice;
        for (WebElement counter : priceBeforeClick) {
            String priceString = counter.getText();
            float priceFloat = Float.parseFloat(priceString.substring(0, priceString.length()-2));
            expected.add(priceFloat);
        }
        Collections.sort(expected);
//List after click "Price"
        locatorTextPrice.click();
        List<WebElement> priceAfterClick = locatorElementPrice;
        for (WebElement counter : priceAfterClick) {
            String priceString = counter.getText();
            float priceFloat = Float.parseFloat(priceString.substring(0, priceString.length()-2));
            actual.add(priceFloat);
        }
        return actual.equals(expected);
    }

    public boolean greenDuckNewElementTest() {
//        Actions builder = new Actions();
        new Actions(driver).moveToElement(bottomRubberDucks).perform();

        new Actions(driver).moveToElement(elementSubcategory).click().perform();

        String expectedString = locatorGreenDuck.getAccessibleName();
        boolean expectedGreen = expectedString.toLowerCase().contains("Green Duck".toLowerCase());
        boolean expectedNew = expectedString.toLowerCase().contains("NEW".toLowerCase());

        return expectedGreen && expectedNew ;
    }
}
