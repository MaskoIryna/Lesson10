package pagejbject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pagejbject.pages.InitClass;
import pagejbject.pages.RubberDucksPage;

import java.util.List;
import java.util.Set;

public class TestClass {

    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
    }


    @Test
    public void findRubberDucks() {
        RubberDucksPage rubberDucksPage = new RubberDucksPage(driver);

        rubberDucksPage.clickRubberDucksBottom();
        Assert.assertEquals("Rubber Ducks | My Store1", rubberDucksPage.getTitleRubberDucksSting());
    }
    @AfterTest
    public void after() {
        driver.quit();
    }
}


