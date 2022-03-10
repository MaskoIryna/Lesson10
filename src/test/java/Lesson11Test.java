import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class Lesson11Test {
    @Test
    public void mySecondTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        driver.findElement(By.linkText(elements.get(8).getText())).click();
//            driver.findElement(By.linkText(elements.get(8).getText())).sendKeys(Keys.ENTER);
//            String login = "admin";
//            driver.findElement(By.xpath("//*[contains(text(), 'Имя пользователя')]")).sendKeys(login);
    }
}


