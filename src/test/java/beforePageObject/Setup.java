package beforePageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

    public class Setup {
        WebDriver driver;

        @BeforeMethod
        public void setup() {
            driver = new ChromeDriver();
            driver.get("https://litecart.stqa.ru/en/");
        }

        @AfterMethod
        public void after() {
            driver.quit();
        }
    }

