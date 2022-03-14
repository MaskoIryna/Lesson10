import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Locale;

public class Lesson13Test extends Setup {

    @Test
    public void findElementSubcategory() {
        WebElement elementRubber = driver.findElement(By.linkText("Rubber Ducks"));
        Actions builder = new Actions(driver);
        builder.moveToElement(elementRubber).perform();

        WebElement Subcategory = driver.findElement(By.linkText("Subcategory"));
        builder.moveToElement(Subcategory).click().perform();

        Assert.assertEquals("Subcategory | My Store1", driver.getTitle());
    }


    @Test
    public void clickName() {
        driver.findElement(By.linkText("Rubber Ducks")).click();
        ArrayList<String> actual = new ArrayList<String>();
        ArrayList<String> expected = new ArrayList<String>();

//List before click "NAME" & sort
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='name']"));
        for (WebElement counter : elements) {
            actual.add(counter.getText());
        }
        Collections.sort(actual);
//List after click "Name"
        driver.findElement(By.xpath("//*[contains(text(),'Name')]")).click();
        List<WebElement> elementsAfterClick = driver.findElements(By.xpath("//div[@class='name']"));
        for (WebElement counter : elementsAfterClick) {
            expected.add(counter.getText());
        }
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void clickPrice() {
        driver.findElement(By.linkText("Rubber Ducks")).click();
        var actual = new ArrayList<Float>();
        var expected = new ArrayList<Float>();
//List before click "Price"
        List<WebElement> priceBeforeClick = driver.findElements(By.xpath("//span[@class='price']"));
        for (WebElement counter : priceBeforeClick) {
            String priceString = counter.getText();
            float priceFloat = Float.parseFloat(priceString.substring(0, priceString.length()-2));
            actual.add(priceFloat);
        }
        Collections.sort(actual);
//List after click "Price"
        driver.findElement(By.xpath("//*[contains(text(),'Price')]")).click();
        List<WebElement> priceAfterClick = driver.findElements(By.xpath("//span[@class='price']"));
        for (WebElement counter : priceAfterClick) {
            String priceString = counter.getText();
            float priceFloat = Float.parseFloat(priceString.substring(0, priceString.length()-2));
            expected.add(priceFloat);
        }
        Assert.assertEquals(actual,expected);
    }
//Yellow Duck is SALE
    @Test
    public void findElementSale() {
        WebElement elementRubber = driver.findElement(By.linkText("Rubber Ducks"));
        Actions builder = new Actions(driver);
        builder.moveToElement(elementRubber).perform();

        WebElement Subcategory = driver.findElement(By.linkText("Subcategory"));
        builder.moveToElement(Subcategory).click().perform();

        boolean expected = driver.findElement(By.xpath("//img[@alt='Yellow Duck']/following-sibling::div")).getText().
                contains("SALE");

        Assert.assertTrue(expected);
    }
//Green DucK is NEW
    @Test
    public void findElementNew() {
        WebElement elementRubber = driver.findElement(By.linkText("Rubber Ducks"));
        Actions builder = new Actions(driver);
        builder.moveToElement(elementRubber).perform();

        WebElement Subcategory = driver.findElement(By.linkText("Subcategory"));
        builder.moveToElement(Subcategory).click().perform();

        String expectedString = driver.findElement(By.xpath("//a[@class='link'][@title='Green DucK']")).getAccessibleName();
        boolean expectedGreen = expectedString.toLowerCase().contains("Green Duck".toLowerCase());
        boolean expectedNew = expectedString.toLowerCase().contains("NEW".toLowerCase());
        boolean expected = expectedGreen && expectedNew ;
        Assert.assertTrue(expected);
    }

}





