package com.ksttlearning.practice10;

import com.ksttlearning.lesson3.Animal;

/**
 * Created by citsym on 24.05.17.
 */
public abstract class Bird extends Animal {

    abstract void fly();

    public Bird createFromEgg(){
        System.out.println("I`m created");
        return getNewBirdInstanse();
    }

    abstract Bird getNewBirdInstanse() ;

}
