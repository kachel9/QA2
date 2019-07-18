package com.alevel.obieliaieva.testprozorro.main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestDK {

    final String setTo="30121420-3";

    @Test
    public void checkGoogle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kache\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://prozorro.gov.ua/tender/search");

        WebElement dk = driver.findElement(By.xpath("//*[contains(@class,'buttons')]//*[text()='ДК021:2015']"));
        dk.click();

        WebElement selec =driver.findElement(By.xpath("//*[@id=\"blocks\"]/div/div/div[1]/input"));
        selec.sendKeys(setTo);
        selec.sendKeys(Keys.ENTER);

        String text = driver.findElement(By.className("result-all")).getText();
        System.out.println(text);

        Assert.assertEquals(text, "Знайдено: 29");
        driver.close();

}}
