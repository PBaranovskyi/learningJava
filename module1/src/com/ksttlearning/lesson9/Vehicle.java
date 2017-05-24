package com.ksttlearning.lesson9;

/**
 * Created by citsym on 22.05.17.
 */
public class Vehicle {

    protected int currentSpeed;
    private String driverName;
    private boolean hasDriver;
    private int totalDistanse;


    public void drive(int distance) {
        totalDistanse += distance;

        System.out.println("We passed " + distance);
    }


    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
}
