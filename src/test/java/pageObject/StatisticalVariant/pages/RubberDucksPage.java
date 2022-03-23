package pageObject.StatisticalVariant.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageObject.StatisticalVariant.Helper.Locators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RubberDucksPage {
    final static By bottomRubberDucks = Locators.getLocator("RubberDucksPage.bottomRubberDucks");
    final static By elementSubcategory = Locators.getLocator("RubberDucksPage.elementSubcategory");
    final static By elementSale = Locators.getLocator("RubberDucksPage.elementSale");
    final static By locatorElementRD_Name = Locators.getLocator("RubberDucksPage.locatorElementRD_Name");
    final static By locatorElementPrice = Locators.getLocator("RubberDucksPage.locatorElementPrice");
    final static By locatorGreenDuck = Locators.getLocator("RubberDucksPage.locatorGreenDuck");
    final static By locatorTextPrice = Locators.getLocator("RubberDucksPage.locatorTextPrice");
    final static String elementRD_NameClick = "//*[contains(text(),'Name')]";
    public static String expectedTitleRD = "Rubber Ducks | My Store1";
    public static String expectedTitleSubcategory = "Subcategory | My Store1";

    public static void clickRubberDucksBottom(WebDriver driver) {
        driver.findElement(bottomRubberDucks).click();
    }

    public static String getTitleRubberDucksSting(WebDriver driver) {
        return  driver.getTitle();
    }
    public static String findElementSubcategoryGetTitle(WebDriver driver) {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(bottomRubberDucks)).perform();

        builder.moveToElement(driver.findElement(elementSubcategory)).click().perform();
        return driver.getTitle();
    }
    public static boolean clickNameAndSort(WebDriver driver) {
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

    public static boolean findElementSaleRubberDucks(WebDriver driver) {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(bottomRubberDucks)).perform();
        builder.moveToElement(driver.findElement(elementSubcategory)).click().perform();

        return driver.findElement(elementSale).getText().
                contains("SALE");

    }
    public static boolean clickPriceAndSortRubberDucksPage(WebDriver driver) {
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

    public static boolean greenDuckNewElementTest(WebDriver driver) {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(bottomRubberDucks)).perform();

        builder.moveToElement(driver.findElement(elementSubcategory)).click().perform();

        String expectedString = driver.findElement(locatorGreenDuck).getAccessibleName();
        boolean expectedGreen = expectedString.toLowerCase().contains("Green Duck".toLowerCase());
        boolean expectedNew = expectedString.toLowerCase().contains("NEW".toLowerCase());

        return expectedGreen && expectedNew ;
    }


}
