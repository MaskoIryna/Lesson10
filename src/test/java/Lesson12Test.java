import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

public class Lesson12Test {

    @Test
    public void InitTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        String title = driver.getTitle();
        String result = "Online Store | My Store1";
        Assert.assertEquals(title,result);
        driver.quit();
    }
    @Test
    public  void findRubberDucks() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        driver.findElement(By.linkText("Rubber Ducks")).sendKeys(Keys.ENTER);
        Assert.assertEquals(driver.getTitle(),"Rubber Ducks | My Store1");
        driver.quit();
    }
    @Test
    public void findDeliveryInformation() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        driver.findElement(By.linkText("Delivery Information")).click();
        String result = driver.findElement(By.cssSelector("#box-information-links>.title")).getText();
        String infTitle = "Information";
        Assert.assertEquals(result,infTitle);
        driver.quit();
    }
    @Test
    public void findTermsConditions() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        driver.findElement(By.xpath("//*[@id='site-menu']/ul/li[5]/a")).click();
        String result = driver.findElement(By.cssSelector("#main > div.middle > div.content > h1 > font > font > u")).
                getText();
        boolean infoTermsConditions = result.contains("Условия");
        Assert.assertTrue(infoTermsConditions);
        driver.quit();
    }
}



