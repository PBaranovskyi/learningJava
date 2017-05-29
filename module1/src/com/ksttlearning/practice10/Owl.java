package com.ksttlearning.practice10;


/**
 * Created by citsym on 24.05.17.
 */
public class Owl extends Bird {
    @Override
    void fly() {
        System.out.println("OWL Can fly");
    }

    @Override
    Owl getNewBirdInstanse() {
        return new Owl();
    }


}
