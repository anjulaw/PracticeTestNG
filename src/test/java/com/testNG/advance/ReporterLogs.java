package com.testNG.advance;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;

import java.util.concurrent.TimeUnit;

/**
 * Created by Anjulaw on 12/5/2015.
 */
public class ReporterLogs {

    private static WebDriver webDriver;
    private static Logger log = Logger.getLogger("devpinoyLogger");

    @Test
    public void testLogging(){

        DOMConfigurator.configure("src/main/resources/log4j.properties");

        webDriver = new FirefoxDriver();
        log.info("New driver instantiated");

        webDriver.get("http://healthunify.com/bmicalculator/");
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        log.info("BMI Calculator loaded successfully");

        log.info("Entering weight");
        webDriver.findElement(By.name("wg")).sendKeys("87");
        log.info("selecting KG");
        webDriver.findElement(By.name("opt1")).sendKeys("kilograms");
        log.info("selecting height in feet");
        webDriver.findElement(By.name("opt2")).sendKeys("5");
        log.info("selecting height in inchs");
        webDriver.findElement(By.name("opt3")).sendKeys("10");
        log.info("Clicking on calculate");
        webDriver.findElement(By.name("cc")).click();

        log.info("Getting SIUnit value");
        String SIUnit = webDriver.findElement(By.name("si")).getAttribute("value");
        log.info("Getting USUnit value");
        String USUnit = webDriver.findElement(By.name("us")).getAttribute("value");
        log.info("Getting UKUnit value");
        String UKUnit = webDriver.findElement(By.name("uk")).getAttribute("value");
        log.info("Getting overall description");
        String note = webDriver.findElement(By.name("desc")).getAttribute("value");

        log.info("SI unit " + SIUnit);
        log.info("US unit value " + USUnit);
        log.info("UK Unit Value " + UKUnit);
        log.info("overall description " + note);

        webDriver.quit();

    }
}
