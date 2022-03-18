package pagejbject.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RubberDucksPage {
    private By bottomRubberDucks = By.linkText("Rubber Ducks");
    private By elementSubcategory = By.linkText("Subcategory");
    private By elementSale = By.xpath("//img[@alt='Yellow Duck']/following-sibling::div");
    private String elementRD_Name= "//div[@class='name']";
    private String elementRD_NameClick = "//*[contains(text(),'Name')]";
    public String expectedTitleRD = "Rubber Ducks | My Store1";
    public String expectedTitleSubcategory = "Subcategory | My Store1";
    private String elementPrice = "//span[@class='price']";
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
    public String findElementSubcategoryGetTitle() {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(bottomRubberDucks)).perform();

        builder.moveToElement(driver.findElement(elementSubcategory)).click().perform();
        String titleSubcategory = driver.getTitle();
        return titleSubcategory;
    }
    public boolean clickNameAndSort() {
        driver.findElement(bottomRubberDucks).click();
        ArrayList<String> actual = new ArrayList<String>();
        ArrayList<String> expected = new ArrayList<String>();

//List before click "NAME" & sort
        List<WebElement> elements = driver.findElements(By.xpath(elementRD_Name));
        for (WebElement counter : elements) {
            expected.add(counter.getText());
        }
        java.util.Collections.sort(expected);
//List after click "Name"
        driver.findElement(By.xpath(elementRD_NameClick)).click();
        List<WebElement> elementsAfterClick = driver.findElements(By.xpath(elementRD_Name));
        for (WebElement counter : elementsAfterClick) {
            actual.add(counter.getText());
        }
        boolean result = actual.equals(expected);
        return result;
    }

    public boolean findElementSaleRubberDucks() {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(bottomRubberDucks)).perform();
        builder.moveToElement(driver.findElement(elementSubcategory)).click().perform();

        boolean result = driver.findElement(elementSale).getText().
                contains("SALE");
        return result;

    }
    public boolean clickPriceAndSortRubberDucksPage() {
        driver.findElement(bottomRubberDucks).click();
        ArrayList<Float> actual = new ArrayList<Float>();
        ArrayList<Float> expected = new ArrayList<Float>();
//List before click "Price"
        List<WebElement> priceBeforeClick = driver.findElements(By.xpath(elementPrice));
        for (WebElement counter : priceBeforeClick) {
            String priceString = counter.getText();
            float priceFloat = Float.parseFloat(priceString.substring(0, priceString.length()-2));
            expected.add(priceFloat);
        }
        Collections.sort(expected);
//List after click "Price"
        driver.findElement(By.xpath("//*[contains(text(),'Price')]")).click();
        List<WebElement> priceAfterClick = driver.findElements(By.xpath(elementPrice));
        for (WebElement counter : priceAfterClick) {
            String priceString = counter.getText();
            float priceFloat = Float.parseFloat(priceString.substring(0, priceString.length()-2));
            actual.add(priceFloat);
        }
        boolean result = actual.equals(expected);
        return result;
    }

    public boolean greenDuckNewElementTest() {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(bottomRubberDucks)).perform();

        builder.moveToElement(driver.findElement(elementSubcategory)).click().perform();

        String expectedString = driver.findElement(By.xpath("//a[@class='link'][@title='Green DucK']")).getAccessibleName();
        boolean expectedGreen = expectedString.toLowerCase().contains("Green Duck".toLowerCase());
        boolean expectedNew = expectedString.toLowerCase().contains("NEW".toLowerCase());
        boolean result = expectedGreen && expectedNew ;

        return result;
    }


}
