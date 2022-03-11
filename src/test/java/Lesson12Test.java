import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import org.testng.annotations.*;

public class Lesson12Test {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
    }

    @Test
    public void InitTest() {
        String expected = driver.getTitle();
        String actual = "Online Store | My Store1";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public  void findRubberDucks() {
        driver.findElement(By.linkText("Rubber Ducks")).sendKeys(Keys.ENTER);
        Assert.assertEquals("Rubber Ducks | My Store1",driver.getTitle());
    }

    @Test
    public  void findElementSubcategory() {
        WebElement elementRubber = driver.findElement(By.linkText("Rubber Ducks"));
        Actions builder = new Actions(driver);
        builder.moveToElement(elementRubber).perform();
        WebElement Subcategory = driver.findElement(By.linkText("Subcategory"));
        builder.moveToElement(Subcategory).click().perform();
        Assert.assertEquals("Subcategory | My Store1",driver.getTitle());


    }

    @Test
    public void findDeliveryInformation() {
        driver.findElement(By.linkText("Delivery Information")).click();
        String expected = driver.findElement(By.cssSelector("#box-information-links>.title")).getText();
        String actual = "Information";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void findTermsConditions() {
        driver.findElement(By.xpath("//*[@id='site-menu']/ul/li[5]/a")).click();
        String result = driver.findElement(By.cssSelector("#main > div.middle > div.content > h1 > font > font > u")).
                getText();
        boolean infoTermsConditions = result.contains("Условия");
        Assert.assertTrue(infoTermsConditions);
    }

    @AfterMethod
    public void after() {

        driver.quit();
    }
}



