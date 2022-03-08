import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lesson12Test {
    @Test
    public void InitTest(){
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
            driver.findElement(By.linkText("Rubber Ducks")).click();
            Assert.assertEquals(driver.getTitle(),"Rubber Ducks | My Store1");
            driver.quit();
        }
        @Test
    public void findDeliveryInformation() {

        }
    }

