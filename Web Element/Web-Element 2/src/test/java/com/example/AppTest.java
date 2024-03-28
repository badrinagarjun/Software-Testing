package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
    @Test
    public void simple() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.moneycontrol.com/");
        Thread.sleep(20000);
        driver.findElement(By.xpath("//*[@id='search_str']")).sendKeys("Reliance Industries",Keys.ENTER);
        Thread.sleep(10000);
        driver.findElement(By.partialLinkText("Funds")).click();
        Thread.sleep(20000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scroll-by(0,250)","");
        driver.findElement(By.xpath("//*[@id=\'mc3_return\']/div[1]/ul/li[2]/a")).click();

    }

}