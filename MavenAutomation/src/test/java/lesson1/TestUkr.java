package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUkr {
    @Test
    public void ukrTest() {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.ukr.net/");
            driver.switchTo().frame("mail widget");
            WebElement element = driver.findElement(By.id("id-input-password"));
         element.sendKeys("test");

        } finally {

            driver.quit();

        }
    }
}
