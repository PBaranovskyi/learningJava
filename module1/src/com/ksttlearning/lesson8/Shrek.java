package com.ksttlearning.lesson8;

/**
 * Created by citsym on 12.06.17.
 */
public class Shrek implements CanEat, CanBeFunWith {
    @Override
    public void eat() {
        System.out.println("Shrek eats sun");
    }

    @Override
    public void drinkBear(int liters) {
        System.out.println("Shrek drinks water " + liters +" liters");
    }

    @Override
    public void tellAJoke() {
        System.out.println("Shrek tels a joke");
    }
}
