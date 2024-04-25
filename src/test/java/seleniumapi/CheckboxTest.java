package seleniumapi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new EdgeDriver();
        driver.get("http://pragmatic.bg/automation/lecture13/Config.html");
        driver.manage().window().maximize();
    }

    @Test
    public void newTest() {
        WebElement absCheckbox = driver.findElement(By.name("abs"));
        if (!absCheckbox.isSelected()) {
            absCheckbox.click();
        }
        boolean isSelected = absCheckbox.isSelected();
        Assert.assertTrue(isSelected);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
