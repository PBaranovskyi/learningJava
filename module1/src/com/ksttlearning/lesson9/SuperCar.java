package com.ksttlearning.lesson9;

/**
 * Created by citsym on 22.05.17.
 */
public class SuperCar extends Car {

    public SuperCar(int expense) {
        super(expense, new TurboEngine());
        setDriverName("Max");
        System.out.println("CONSTRUCTOR SUPER CAR INIT");
    }


    public void turbo(){
        expense += 10;
        currentSpeed *=2;
    }




}
