package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {
    @BeforeMethod
    public void beforeMethod1(){
        System.out.println("Before1");
    }
    @Test
    public void method1(){
        throw new NullPointerException();
    }


        @Test(dependsOnMethods = "method1")
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
