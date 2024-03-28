package com.example;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AppTest 
{
    @Test
    public void testing() throws Exception
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Laptops")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
        Thread.sleep(7000);
        String a = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[2]")).getText();
        if(a.equals("MacBook air"))
        System.out.println("Its same");
        else
        System.out.println("Its not same");
        Thread.sleep(3000);


        File file = new File("Book1.xls");
        FileInputStream fis = new FileInputStream(file);
        Workbook wb = new HSSFWorkbook(fis);
        Sheet sh = wb.getSheet("Sheet1");
        Row r = sh.getRow(0);
        String x = r.getCell(0).getStringCellValue();
        String y = r.getCell(1).getStringCellValue();
        driver.findElement(By.id("login2")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("loginusername")).sendKeys(x);
        Thread.sleep(3000);
        driver.findElement(By.id("loginpassword")).sendKeys(y);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
        String b = driver.findElement(By.xpath("//*[@id=\"nameofuser\"]")).getText();
        Thread.sleep(3000);
        if(b.equals("Welcome Testalpha"))
            System.out.println("Correct");
        else
            System.out.println("Incorrect");
        Thread.sleep(5000);
        driver.quit();
    }
}
