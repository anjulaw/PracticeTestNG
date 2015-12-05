package com.testNG.advance;

import org.testng.annotations.Test;

/**
 * Created by Anjulaw on 12/5/2015.
 */
public class Grouping {

    @Test(groups = {"car"})
    public void car1(){
        System.out.println("Batch Car - Test car 1");
    }

    @Test(groups = {"car"})
    public void car2(){
        System.out.println("Batch Car - Test car 2");
    }

    @Test(groups = {"Scooter"})
    public void scooter1(){
        System.out.println("Batch Scooter - Test scooter 1");
    }

    @Test (groups = { "Scooter" })
    public void Scooter2() {

        System.out.println("Batch Scooter - Test scooter 2");

    }

    @Test (groups = { "car", "Sedan Car" })
    public void Sedan1() {

        System.out.println("Batch Sedan Car - Test sedan 1");

    }

}
