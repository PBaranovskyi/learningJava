package com.ksttlearning.lesson3;

/**
 * Created by citsym on 12.04.17.
 */
public class Car {
    private String color = "white";
    private int engineValue = 2;
    private int doorsCount;
    private String mode = "NISSAN JUKE";


    public Car(String inputColor) {
//        this(inputColor, 2);
        color = inputColor;

        if (inputColor == null){
            color = "grey";
        }

//        drive(100);
    }

    public Car(String inputColor, int inputEngineValue) {
        this(inputColor);
        engineValue = inputEngineValue;
    }


    public double drive(int distance, int passengersAmount){

        System.out.println(color + " " + mode +" drives somewhere " + distance + " km");

        return  distance * engineValue / passengersAmount;
    }

    public void setColor(String inputColor) {
        color = inputColor;
    }

    public String getColor() {
        return this.color;
    }
}
