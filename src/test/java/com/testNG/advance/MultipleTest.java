package com.testNG.advance;

import org.testng.annotations.Test;

/**
 * Created by Anjulaw on 12/5/2015.
 */
public class MultipleTest {

    @Test(priority = 0)
    public void testOne(){
        System.out.println("This is the Test Case number One");
    }

    @Test(priority = 1)
    public void testTwo(){
        System.out.println("This is the Test Case number Two");
    }

    @Test(priority = 2,enabled = false)
    public void testThree(){
        System.out.println("This is the Test Case number Three");
    }

    @Test(priority = 3)
    public void testFour(){
        System.out.println("This is the Test Case number Four");
    }
}
