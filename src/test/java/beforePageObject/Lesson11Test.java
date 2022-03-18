package beforePageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class Lesson11Test {
    @Test
    public void eighthClickTest(){
        //Go to the 8 link
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        List<WebElement> elements = driver.findElements(By.tagName("a"));

        driver.findElement(By.linkText(elements.get(8).getText())).click();

        driver.get("https://admin:admin@" + driver.getCurrentUrl().substring(8));
        String actual = driver.findElement(By.cssSelector("div.example > p")).getText();
        String expected ="Congratulations! You must have the proper credentials.";
        Assert.assertEquals(actual,expected);
        driver.quit();
    }
}


