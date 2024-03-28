package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest
{
   
    private static final String Select = null;
    @Test
    public void Test() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://dbankdemo.com/bank/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("S@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("P@ssword12");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        Thread.sleep(3000);
        String abc=driver.getCurrentUrl();
        if(abc.contains("home"))
        {
          System.out.print("Login successful");
        }
        else{
          System.out.print("Login Unsuccessful");
        }
      driver.close();
    }
}