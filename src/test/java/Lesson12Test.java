import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.*;

public class Lesson12Test {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
    }
//Test get title jf https://litecart.stqa.ru/en/
    @Test
    public void initTest() {
        String actual = driver.getTitle();
        String expected = "Online Store | My Store1";
        Assert.assertEquals(actual,expected);
    }
//Test go to Rubber Ducks
    @Test
    public  void findRubberDucksTest() {
        driver.findElement(By.linkText("Rubber Ducks")).click();
        String expected ="Rubber Ducks | My Store1";
        Assert.assertEquals(driver.getTitle(),expected);
    }
//Test go to Delivery Information
    @Test
    public void findDeliveryInformationTest() {
        driver.findElement(By.linkText("Delivery Information")).click();
        String actual = driver.findElement(By.cssSelector("#box-information-links>.title")).getText();
        String expected = "Information";
        Assert.assertEquals(actual,expected);
    }
//Test go to TermsConditions
    @Test
    public void findTermsConditionsTest() {
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



