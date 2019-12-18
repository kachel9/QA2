package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void firstTest() {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.ukr.net/");
            WebElement element = driver.findElement(By.id("hplogo"));
            boolean isDisplayed = element.isDisplayed();
            Assert.assertTrue(isDisplayed);
        } finally {

            driver.quit();

        }
    }
}
