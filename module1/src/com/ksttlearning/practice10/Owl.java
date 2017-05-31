package com.ksttlearning.practice10;


/**
 * Created by citsym on 24.05.17.
 */
public class Owl extends Bird {

    private String name;

    public Owl(String name) {
        this.name = name;
    }

    @Override
    void fly() {
        System.out.println("OWL Can fly");
    }

    @Override
    Owl getNewBirdInstanse() {
        return new Owl("");
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    protected String getFoodName() {
        return "mice";
    }
}
