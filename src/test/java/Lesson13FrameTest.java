import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;


public class Lesson13FrameTest {
    // Test go to https://the-internet.herokuapp.com/iframe and write something
    @Test
    public void goFrameAndWriteTest() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Frames']")).click();
        driver.findElement(By.xpath("//a[text()='iFrame']")).click();

        String xpathText = "//body[@class='mce-content-body ']/p";
        driver.switchTo().frame("mce_0_ifr");
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(xpathText)));

        driver.findElement(By.xpath(xpathText)).clear();
        driver.findElement(By.xpath(xpathText)).sendKeys("Hello World");
        driver.findElement(By.xpath(xpathText)).sendKeys(Keys.chord(Keys.CONTROL,"a"));
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//button[@title='Italic']")).click();
        driver.switchTo().frame("mce_0_ifr");
        String actual = driver.findElement(By.tagName("p")).getText();
        driver.switchTo().defaultContent();
        String expected = "Hello World";
        Assert.assertEquals(actual,expected);
        driver.quit();


    }
}
