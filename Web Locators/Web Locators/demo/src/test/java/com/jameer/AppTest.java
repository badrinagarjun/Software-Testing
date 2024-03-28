package com.jameer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
  @Test
  public void print()
  {
      WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
  
        String demobleze="https://www.demoblaze.com/#";
        driver.get(demobleze);
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Laptops")).click();

         driver.get("https://www.demoblaze.com/prod.html?idp_=9");
      //  driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a/img")).click();
         
       driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
       driver.switchTo().alert().accept();

       driver.findElement(By.linkText("Cart")).click();

       String ItemName=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[2]")).getText();

       String price=driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr/td[3]")).getText();

       System.out.println(ItemName+"  "+price);
      
  }
}
