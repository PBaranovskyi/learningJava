package com.ksttlearning.lesson16;

/**
 * Created by citsym on 10.07.17.
 */
public class UseFactory {


    public static void main(String[] args) {

        String var = "Ship";

        Factory factory = new Factory();

        factory.doWork(new CreateBicycle());

        factory.doWork(new CreateCar());

        factory.doWork(() -> {
            String var2 = var.toUpperCase();
            System.out.println("plane created." + var2);
        });
        factory.doWork(() -> {
            System.out.println("gidrocycle created.");
        });

    }
}
