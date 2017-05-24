package com.ksttlearning.lesson9;

/**
 * Created by citsym on 22.05.17.
 */
public class UseCars {

    public static void main(String[] args) {

//        Car myCar = new Car(9);
//
//        myCar.setGasCount(60);
//
//        System.out.println(" Gas count " + myCar.getGasCount());
//
//        myCar.drive(1000);
//
//        System.out.println(" Gas count " + myCar.getGasCount());

        ////////////////



        SuperCar maxCar = new SuperCar(9);

        maxCar.setGasCount(60);

//        System.out.println(" Gas count " + maxCar.getGasCount());
//        maxCar.turbo();
//        maxCar.drive(1000);
//
//        System.out.println(" Gas count " + maxCar.getGasCount());


        SuperCar nastyaCar = new SuperCar(9);

        nastyaCar.setGasCount(100);

        System.out.println(nastyaCar.equals(maxCar));

    }
}
