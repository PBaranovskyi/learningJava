package com.ksttlearning;

import com.ksttlearning.lesson3.Car;

/**
 * Created by citsym on 12.04.17.
 */
public class UseCars {

    static Car car2;



    public static void main(String[] args) {

        String color = "yellow";




        Car sashasCar = new Car(color);
//        sashasCar.setColor("yellow");
//        sashasCar.drive();

        Car petyasCar = sashasCar;

        sashasCar = new Car(null, 2);

//        petyasCar.drive();
//        sashasCar.drive();


        Car car1 = new Car("red" );

        System.out.println( "Car distance " + car1.drive(100, 3));

        System.out.println(car2);

        car1 = null;

        car1 = new Car("blue");


        System.out.println( "Petya has " + petyasCar.getColor() + " car");
    }
}
