package com.ksttlearning.lesson3;


/**
 * Created by citsym on 19.04.17.
 */
public class Animal {

    private static int animalsCount = 3;

    protected String name;
    protected String foodName;

    public Animal() {
        animalsCount++;
    }

    public Animal(String animalName, String animalFoodName) {
        this.name = animalName;
        this.foodName = animalFoodName;
    }


    public void feed() {
        System.out.println(getClass().getSimpleName() + " " + name + " eats " + foodName);
    }


    public static int getAnimalsCount() {
        return animalsCount;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
