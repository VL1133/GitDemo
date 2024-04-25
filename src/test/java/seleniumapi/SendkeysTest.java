package seleniumapi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SendkeysTest {
    WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = new EdgeDriver();
        driver.get("http://abv.bg");
    }

    @Test
    public void newTest(){
        WebElement usernameInputField = driver.findElement(By.id("username"));
        usernameInputField.sendKeys("bla@abv.bg");
        String valueText = usernameInputField.getAttribute("value");
        Assert.assertEquals(valueText, "bla@abv.bg");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
