package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChromeExample {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("http://pragmatic.bg/automation/example4.html");
    }

    @Test
    public void newTest(){
        WebElement selectLoadButton = driver.findElement(By.id("selectLoad"));
        String value = selectLoadButton.getAttribute("value");
        Assert.assertEquals(value, "Click to load the select below");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
