package avic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AvicTests {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://avic.ua/");
    }

    @Test(priority = 1)
    public void checkThatUrlContainsSearchQuery() {
        driver.findElement(By.xpath("//input[@id='input_search']")).clear();
        driver.findElement(By.xpath("//input[@id='input_search']")).sendKeys("iPhone 11", Keys.ENTER);

        assertTrue(driver.getCurrentUrl().contains("query=iPhone"));
    }

    //TODO: write 3-4 more tests, to test functionality of AVIC.UA

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
