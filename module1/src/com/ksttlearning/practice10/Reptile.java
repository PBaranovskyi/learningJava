package com.ksttlearning.practice10;

import com.ksttlearning.lesson3.Animal;

/**
 * Created by citsym on 24.05.17.
 */
public class Reptile extends Animal{

    private String name;
    private String foodName;

    public Reptile() {
    }

    public Reptile(String name, String mice) {
        this.name = name;
        this.foodName = mice;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    protected String getFoodName() {
        return foodName;
    }
}
