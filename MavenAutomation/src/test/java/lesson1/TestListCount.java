package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestListCount {
    @Test
    public void test2(){
        WebDriver driver=new ChromeDriver();

        driver.get("https://rozetka.com.ua/");

        List<WebElement> form__field= driver.findElements(By.className("menu-categories__item"));
        System.out.println(form__field.size());
        driver.close();
    }


    }

