package com.ksttlearning.lesson16;

/**
 * Created by citsym on 10.07.17.
 */
@FunctionalInterface
public interface Task {

    void execute();

    default void someMethod(){
        // logic
    }

}
