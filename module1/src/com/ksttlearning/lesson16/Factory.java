package com.ksttlearning.lesson16;

/**
 * Created by citsym on 10.07.17.
 */
public class Factory {


    public void doWork(Task task){

        // some logic

        prepareFactoryForWork();

        task.execute();
    }

    private void prepareFactoryForWork() {
        // reset state
        // create workers
        System.out.println("Preparation is done");
    }
}
