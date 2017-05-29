package com.ksttlearning.practice10;


/**
 * Created by citsym on 24.05.17.
 */
public class Parrot extends Bird {


    @Override
    void fly() {
        System.out.println("can`t fly");
    }

    @Override
    Bird getNewBirdInstanse() {
        return new Parrot();
    }
}
