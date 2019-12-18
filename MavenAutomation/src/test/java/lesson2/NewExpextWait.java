package lesson2;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewExpextWait {
    @Test
    public void ukrTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ukr.net/");
        new WebDriverWait(driver,20)
                .ignoring(ElementNotVisibleException.class)
                .until(new ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver webDriver) {
                        WebElement element = webDriver.findElement(By.xpath("xx"));
                        return element.getAttribute("color")
                                .equals("red");
                    }
                });
    }


}
