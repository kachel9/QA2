package com.alevel.obieliaieva.testprozorro.main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPrice {
    final String setFrom="50000";
    final String setTo="500000";

    @Test
    public void checkGoogle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kache\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://prozorro.gov.ua/tender/search");


        WebElement price = driver.findElement(By.xpath("//*[contains(@class,'buttons')]//*[text()='Вартість']"));
        price.click();

        WebElement setfrom = (new WebDriverWait(driver,
                5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"blocks\"]/div/input[1]")));
        setfrom.sendKeys(setFrom);

      WebElement settoo = (new WebDriverWait(driver,
                5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"blocks\"]/div/input[2]")));
        settoo.sendKeys(setTo);


        String text = driver.findElement(By.className("result-all")).getText();
        System.out.println(text);


        Assert.assertEquals(text, "Знайдено: 1 216 422");
       driver.close();


    }
}

