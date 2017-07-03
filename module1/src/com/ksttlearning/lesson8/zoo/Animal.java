package com.ksttlearning.lesson8.zoo;

import com.ksttlearning.lesson8.CanBeFunWith;
import com.ksttlearning.lesson8.CanEat;

/**
 * Created by Volodymyr Kochergin on 24.05.2017.
 */
public abstract class Animal implements CanEat, CanBeFunWith {
    private static int animalsCount = 0;

    public Animal() {
        Animal.animalsCount++;
    }

    @Override
    public void eat() {
        System.out.println("This is animal and it eats");
    }

    @Override
    public void drinkBear(int liters) {
        System.out.println("Animal drinks water " + liters + " liters");
    }

    @Override
    public void tellAJoke() {
        System.out.println("Animal tels stupid joke");
    }

    public static int getAnimalsCount() {
        return animalsCount;
    }
}
