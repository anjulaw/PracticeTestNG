package com.testNG.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Anjulaw on 12/6/2015.
 */
public class Parameter {

    private static WebDriver driver;

    @Test

    @Parameters({"sUserName","sPassword"})

    public void loginParam(String sUserName,String sPassword ){

        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://www.store.demoqa.com");
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();

        driver.findElement(By.id("log")).sendKeys(sUserName);
        driver.findElement(By.id("pwd")).sendKeys(sPassword);

        driver.findElement(By.id("login")).click();

        driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();

        driver.quit();
    }
}
