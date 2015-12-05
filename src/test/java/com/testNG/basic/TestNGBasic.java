package com.testNG.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

/**
 * Created by Anjulaw on 11/29/2015.
 */
public class TestNGBasic {

    String baseUrl = "http://newtours.demoaut.com";
    WebDriver driver = new FirefoxDriver();
    String expectedTitle = "";
    String actualTitle = "";

    @BeforeTest
    public void launchBrowser(){
        System.out.println("This is BeforeTest");

    }

    @BeforeMethod
    public void verifyHomePageTitle(){
        System.out.println("This is BeforeMethod ");
    }

    @Test(priority = 0)
    public void register(){
        System.out.println("This is first testcase");

    }

    @Test(priority = 1)
    public void support(){
        System.out.println("This is second Testcase");
    }

    @AfterMethod
    public void goBackToHomePage(){
        System.out.println("This is AfterMethod");
    }

    @AfterTest
    public void terminateBrowser(){
        System.out.println("This is AfterTest");
    }



    }
