package com.ksttlearning.lesson3;

/**
 * Created by citsym on 19.04.17.
 */
public class Animal {

    private String name;
    private String foodName;

    public Animal(String animalName, String animalFoodName) {
        this.name = animalName;
        this.foodName = animalFoodName;
    }


    public void feed() {
        System.out.println(name + " eats " + foodName);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
