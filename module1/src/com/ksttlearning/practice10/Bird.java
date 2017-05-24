package com.ksttlearning.practice10;

import com.ksttlearning.lesson3.Animal;

/**
 * Created by citsym on 24.05.17.
 */
public class Bird extends Animal {

    void fly(){
        System.out.println( getClass().getSimpleName() +  " can fly");
    }
}
