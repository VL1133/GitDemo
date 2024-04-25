package seleniumapi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButton {
    WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = new EdgeDriver();
        driver.get("http://pragmatic.bg/automation/lecture13/Config.html");
    }

    @Test
    public void newTest(){
        WebElement petrolRadiobutton = driver.findElement(By.cssSelector("[value='Petrol']"));
        petrolRadiobutton.click();
        Assert.assertTrue(petrolRadiobutton.isSelected());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
