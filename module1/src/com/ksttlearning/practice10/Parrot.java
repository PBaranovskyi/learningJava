package com.ksttlearning.practice10;


/**
 * Created by citsym on 24.05.17.
 */
public class Parrot extends Bird {

    private String name;

    public Parrot(String name) {

        this.name = name;
    }

    @Override
    void fly() {
        System.out.println("can`t fly");
    }

    @Override
    Bird getNewBirdInstanse() {
        return new Parrot("");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    protected String getFoodName() {
        return "Seed";
    }
}
