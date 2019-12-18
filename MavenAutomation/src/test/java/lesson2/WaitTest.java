package lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WaitTest {
    @Test
    public void waitTest() {
        WebDriver driver = new ChromeDriver();


        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.ukr.net/");
            WebElement element = driver.findElement(By.id("hplogo"));
            boolean isDisplayed = element.isDisplayed();
            Assert.assertTrue(isDisplayed);
        } finally {

            driver.quit();

        }
    }
}
