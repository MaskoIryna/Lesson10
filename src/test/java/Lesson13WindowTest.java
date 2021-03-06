import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lesson13WindowTest {

        WebDriver driver;

        @BeforeTest
        public void setup()  {
            driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/");
            }
        @Test
//Test go to https://the-internet.herokuapp.com/windows and click "Click Here"(new windows)
        public void multipleWindowsTest() {
            String initHandle = driver.getWindowHandle();
            driver.findElement(By.linkText("Multiple Windows")).click();
            driver.findElement(By.linkText("Click Here")).click();

            String newHandle = driver.getWindowHandles().toArray()[1].toString();
            driver.switchTo().window(newHandle);
            String actual = driver.findElement(By.tagName("h3")).getText();

            Assert.assertEquals(actual,"New Window");
            driver.close();
            driver.switchTo().window(initHandle);
        }

        @AfterTest
        public void goOut() {
            driver.quit();



        }

    }

