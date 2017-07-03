package com.ksttlearning.lesson8.zoo;

/**
 * Created by Volodymyr Kochergin on 24.05.2017.
 */
public class Bird extends Animal {
    void fly(){
        System.out.println(getClass().getSimpleName() + " can fly!");
    }

}
