package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
    @Test
    public void testing() throws Exception
    {
        //testng1
        WebDriverManager.chromedriver().setup();
        WebDriver dri=new ChromeDriver();
        dri.get("https://economictimes.indiatimes.com/et-now/results");
        dri.manage().window().maximize();
        dri.findElement(By.xpath("//*[@id=\"topnav\"]/div[10]/a")).click();
        Thread.sleep(5000);
        JavascriptExecutor js=(JavascriptExecutor)dri;
        js.executeScript("window.scrollBy(0,900)");
        dri.findElement(By.xpath("//*[@id=\"amcSelection\"]")).click();
        dri.findElement(By.linkText("Canara Robeco")).click();
        Thread.sleep(2000);
        dri.findElement(By.xpath("//*[@id=\"schemenm\"]")).click();
        dri.findElement(By.linkText("Canara Robeco Bluechip Equity Direct-G")).click();
        dri.findElement(By.xpath("//*[@id=\"anchor3\"]")).click();
        dri.navigate().to("https://economictimes.indiatimes.com/canara-robeco-bluechip-equity-fund-direct-plan/mffactsheet/schemeid-15765.cms");
        dri.findElement(By.xpath("//*[@id=\"installment_type\"]/li/i")).click();
        dri.findElement(By.xpath("//*[@id=\"installment_type\"]/li/ul/li[1]/span")).click();
        dri.findElement(By.xpath("//*[@id=\"mfNav\"]/div/ul/li[2]")).click();
        Thread.sleep(2000);
        dri.close();
    }
}
