package com.ksttlearning.lesson3;

/**
 * Created by citsym on 12.04.17.
 */
public class Car {
    String color = "white";
    int engineValue = 3;
    int doorsCount = 4;
    String mode = "NISSAN JUKE";

    public void drive(){
        System.out.println(color + " " + mode +" drives somewhere");
    }

    public void setColor(String inputColor) {
        color = inputColor;
    }
}
