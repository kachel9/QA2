package lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplWait {
    @Test
    public void ukrTest() {
        WebDriver driver = new ChromeDriver();

          //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); implicit
            driver.get("https://www.ukr.net/");
           new WebDriverWait(driver,20)
           .until(ExpectedConditions.visibilityOf(
                   driver.findElement(By.xpath("xx"))
           ));

    }
}
