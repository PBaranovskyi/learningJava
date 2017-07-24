package com.ksttlearning.lesson16;

/**
 * Created by citsym on 10.07.17.
 */
public class CreateCar implements Task {
    @Override
    public void execute() {
        System.out.println("Car created");
    }

//    @Override
//    public void execute(String param) {
//        System.out.println(param + "created");
//    }
}
