package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestImg {
    @Test
    public void countImg(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ukr.net/");
        System.out.println( driver.findElements(By.tagName("img")).size());
    }
}
