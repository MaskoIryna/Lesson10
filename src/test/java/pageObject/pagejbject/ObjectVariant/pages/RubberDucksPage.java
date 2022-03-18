package pageObject.pagejbject.ObjectVariant.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RubberDucksPage {
    final By bottomRubberDucks = By.linkText("Rubber Ducks");
    final By elementSubcategory = By.linkText("Subcategory");
    final By elementSale = By.xpath("//img[@alt='Yellow Duck']/following-sibling::div");
    final By locatorElementRD_Name = By.xpath("//div[@class='name']");
    final By locatorElementPrice = By.xpath("//span[@class='price']");
    final By locatorGreenDuck = By.xpath("//a[@class='link'][@title='Green DucK']");
    final By locatorTextPrice = By.xpath("//*[contains(text(),'Price')]");
    final String elementRD_NameClick = "//*[contains(text(),'Name')]";
    public String expectedTitleRD = "Rubber Ducks | My Store1";
    public String expectedTitleSubcategory = "Subcategory | My Store1";
    final WebDriver driver;

    public RubberDucksPage(WebDriver driver){
        this.driver = driver;
    }

    public  void clickRubberDucksBottom() {
        driver.findElement(bottomRubberDucks).click();
    }

    public  String getTitleRubberDucksSting() {
        return  driver.getTitle();
    }
    public String findElementSubcategoryGetTitle() {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(bottomRubberDucks)).perform();

        builder.moveToElement(driver.findElement(elementSubcategory)).click().perform();
        return driver.getTitle();
    }
    public boolean clickNameAndSort() {
        driver.findElement(bottomRubberDucks).click();
        ArrayList<String> actual = new ArrayList<>();
        ArrayList<String> expected = new ArrayList<>();

//List before click "NAME" & sort
        List<WebElement> elements = driver.findElements(locatorElementRD_Name);
        for (WebElement counter : elements) {
            expected.add(counter.getText());
        }
        Collections.sort(expected);
//List after click "Name"
        driver.findElement(By.xpath(elementRD_NameClick)).click();
        List<WebElement> elementsAfterClick = driver.findElements(locatorElementRD_Name);
        for (WebElement counter : elementsAfterClick) {
            actual.add(counter.getText());
        }
        return  actual.equals(expected);
    }

    public boolean findElementSaleRubberDucks() {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(bottomRubberDucks)).perform();
        builder.moveToElement(driver.findElement(elementSubcategory)).click().perform();

        return driver.findElement(elementSale).getText().
                contains("SALE");

    }
    public boolean clickPriceAndSortRubberDucksPage() {
        driver.findElement(bottomRubberDucks).click();
        ArrayList<Float> actual = new ArrayList<>();
        ArrayList<Float> expected = new ArrayList<>();
//List before click "Price"
        List<WebElement> priceBeforeClick = driver.findElements(locatorElementPrice);
        for (WebElement counter : priceBeforeClick) {
            String priceString = counter.getText();
            float priceFloat = Float.parseFloat(priceString.substring(0, priceString.length()-2));
            expected.add(priceFloat);
        }
        Collections.sort(expected);
//List after click "Price"
        driver.findElement(locatorTextPrice).click();
        List<WebElement> priceAfterClick = driver.findElements(locatorElementPrice);
        for (WebElement counter : priceAfterClick) {
            String priceString = counter.getText();
            float priceFloat = Float.parseFloat(priceString.substring(0, priceString.length()-2));
            actual.add(priceFloat);
        }
        return actual.equals(expected);
    }

    public boolean greenDuckNewElementTest() {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(bottomRubberDucks)).perform();

        builder.moveToElement(driver.findElement(elementSubcategory)).click().perform();

        String expectedString = driver.findElement(locatorGreenDuck).getAccessibleName();
        boolean expectedGreen = expectedString.toLowerCase().contains("Green Duck".toLowerCase());
        boolean expectedNew = expectedString.toLowerCase().contains("NEW".toLowerCase());

        return expectedGreen && expectedNew ;
    }


}
