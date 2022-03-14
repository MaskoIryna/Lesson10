import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Lesson13FrameTest {
    @Test
    public void FrameTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Frames']")).click();
        driver.findElement(By.xpath("//a[text()='iFrame']")).click();

//        WebElement elementEdit = driver.findElement(By.xpath("//span[text()='Edit']"));
//        elementEdit.click();
//        Actions builder = new Actions(driver);
//        WebElement dd = driver.findElement(By.xpath("//div[text()='Select all']"));
//
//                builder.moveToElement(dd).sendKeys(Keys.ENTER).sendKeys(Keys.CONTROL + "X");
//


        driver.switchTo().frame("mce_0_ifr");
        String xpathElement = "//body[@class='mce-content-body ' ]/p";

         driver.findElement(By.xpath(xpathElement)).clear();
        driver.findElement(By.xpath(xpathElement)).sendKeys("Hello World");
    }
}
