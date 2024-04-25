package seleniumapi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebElementTest {

    WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = new EdgeDriver();
        driver.get("http://pragmatic.bg/automation/lecture13/Config.html");
    }

    @Test
    public void newTest(){
        WebElement selectColorsLabel = driver.findElement(By.xpath("//*[@id='tabs-1']/p[4]"));
        String selectColorsText = selectColorsLabel.getText();
        Assert.assertTrue(selectColorsText.contains("Select Colors (You can select multiple Colors):"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
