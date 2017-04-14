package com.ksttlearning.lesson3;

/**
 * Created by citsym on 12.04.17.
 */
public class UseCars {

    public static void main(String[] args) {

        Car sashasCar = new Car();
        sashasCar.setColor("yellow");
//        sashasCar.drive();

        Car petyasCar = sashasCar;

        sashasCar = new Car();
        sashasCar.setColor("Blue");

        petyasCar.drive();
        sashasCar.drive();

    }
}
