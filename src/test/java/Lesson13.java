import com.sun.jdi.ByteType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Lesson13 extends Setup{

    @Test
    public void findElementSubcategory() {
        WebElement elementRubber = driver.findElement(By.linkText("Rubber Ducks"));
        Actions builder = new Actions(driver);
            builder.moveToElement(elementRubber).perform();

            WebElement Subcategory = driver.findElement(By.linkText("Subcategory"));
            builder.moveToElement(Subcategory).click().perform();

            Assert.assertEquals("Subcategory | My Store1", driver.getTitle());
        }

/*    @Test
/*    public void clickName() {
        driver.findElement(By.linkText("Rubber Ducks")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='box-category']/nav/a[1]")).click();
        String elementName = driver.findElement(By.xpath("//*[@id='box-category']/nav/a[1]")).getText();
        String bottom = driver.findElement(By.xpath("//*[@id='box-category']/nav/span")).getAttribute("class");
        boolean result = bottom.contains("active");
        Assert.assertTrue(result);
        }
        */

    @Test
    public void clickName() {
            driver.findElement(By.linkText("Rubber Ducks")).click();
            driver.findElement(By.xpath("//*[contains(text(),'Name')]")).click();
            ArrayList <String> actual = new ArrayList<String>();

            List<WebElement> elements = driver.findElements(By.xpath("//div[@class='name']"));
            for (WebElement element: elements) {
                actual.add(element.getText());
            }
                Collections.sort(actual);
            for (WebElement counter: elements) {
                String Expected = driver.findElement(By.xpath("//div[@class='name']")).getText();
                Assert.assertEquals(actual,Expected);
            }
    }


    @Test
    public void clickPrice() {
        driver.findElement(By.linkText("Rubber Ducks")).click();
        driver.findElement(By.xpath("//*[@id='box-category']/nav/a[1]")).click();
        }


}

