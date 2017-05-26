package com.ksttlearning.lesson8.zoo;

/**
 * Created by Volodymyr Kochergin on 24.05.2017.
 */
public class Animal {
    private static int animalsCount = 0;

    public Animal() {
        Animal.animalsCount++;
    }

    public void eat() {
        System.out.println("This is animal and it eats");
    }

    public static int getAnimalsCount() {
        return animalsCount;
    }
}
