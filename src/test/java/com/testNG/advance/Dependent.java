package com.testNG.advance;

import org.testng.annotations.Test;

/**
 * Created by Anjulaw on 12/5/2015.
 */
public class Dependent {

    @Test
    public void openBrowser(){
        System.out.println("This will execute first (Open Browser)");
    }

    @Test(dependsOnMethods = {"openBrowser"})
    public void signIn(){
        System.out.println("This will execute second (SignIn)");
    }

    @Test(dependsOnMethods = {"signIn"})
    public void logOut(){
        System.out.println("This will execute third (Log Out)");
    }
}
