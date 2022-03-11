import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class Lesson11Test {
    @Test
    public void mySecondTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        List<WebElement> elements = driver.findElements(By.tagName("a"));

        driver.findElement(By.linkText(elements.get(8).getText())).click();

        driver.get("https://admin:admin@" +driver.getCurrentUrl().substring(8));
        String result = driver.findElement(By.cssSelector("div.example > p")).getText();
        Assert.assertEquals("Congratulations! You must have the proper credentials.",result);
        driver.quit();
    }
}


