package com.alevel.obieliaieva.testprozorro.main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestStatus {

    final String setTo = "Період уточнень";

    @Test
    public void checkGoogle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kache\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://prozorro.gov.ua/tender/search");

        WebElement status = driver.findElement(By.xpath("//*[contains(@class,'buttons')]//*[text()='Статус']"));
        status.click();

        WebElement selec = driver.findElement(By.xpath("//*[@id=\"blocks\"]/div/div/div[1]/input"));
        selec.sendKeys(setTo);
        selec.sendKeys(Keys.ENTER);

        String textStatus = driver.findElement(By.className("result-all")).getText();
        System.out.println(textStatus);

        Assert.assertEquals(textStatus, "Знайдено: 1 600");
        driver.close();
    }
}