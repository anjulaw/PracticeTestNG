package com.testNG.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Anjulaw on 11/29/2015.
 */
public class TestNGSelinium {

    String baseUrl = "http://newtours.demoaut.com";
    WebDriver driver = new FirefoxDriver();
    String expectedTitle = "";
    String actualTitle = "";

    @BeforeTest
    public void launchBrowser(){
        driver.manage().window().maximize();
        driver.get(baseUrl);

    }

    @BeforeMethod
    public void verifyHomePageTitle(){
        expectedTitle = "Welcome: Mercury Tours";
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @Test(priority = 0)
    public void register(){
        driver.findElement(By.linkText("REGISTER")).click();
        expectedTitle = "Register: Mercury Tours";
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @Test(priority = 1)
    public void support(){
        driver.findElement(By.linkText("SUPPORT")).click();
        expectedTitle = "Under Construction: Mercury Tours";
        actualTitle = driver.getTitle();
    }

    @AfterMethod
    public void goBackToHomePage(){
        driver.findElement(By.linkText("Home")).click();
    }

    @AfterTest
    public void terminateBrowser(){
        driver.quit();

    }
}
