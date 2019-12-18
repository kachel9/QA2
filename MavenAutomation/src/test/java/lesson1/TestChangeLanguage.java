package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestChangeLanguage {
    @Test
    public void changeLang(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement element=driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a"));
        element.click();

    }
}
