package pageObject.FactoryPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
        protected WebDriver driver;
        protected String baseURL = "https://litecart.stqa.ru/en/";

        @BeforeTest
        public void setup() {
            driver = new ChromeDriver();
            driver.get(baseURL);
        }

        @AfterTest
        public void after() {
            driver.quit();
        }
    }



