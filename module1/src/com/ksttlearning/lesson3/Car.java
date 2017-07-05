package com.ksttlearning.lesson3;

import com.ksttlearning.lesson14.Item;

/**
 * Created by citsym on 12.04.17.
 */
public class Car extends Item {
    private String color = "white";
    private int engineValue = 2;
    private int doorsCount;
    private String model = "NISSAN JUKE";


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


    public Car(String model, String color,  int inputEngineValue) {
        this(color, inputEngineValue);
        this.model = model;
    }


    public double drive(int distance, int passengersAmount){

        System.out.println(color + " " + model +" drives somewhere " + distance + " km");

        return  distance * engineValue / passengersAmount;
    }

    public void setColor(String inputColor) {
        color = inputColor;
    }

    public String getColor() {
        return this.color;
    }


    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engineValue=" + engineValue +
                ", doorsCount=" + doorsCount +
                ", model='" + model + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (engineValue != car.engineValue) return false;
        if (doorsCount != car.doorsCount) return false;
        if (getColor() != null ? !getColor().equals(car.getColor()) : car.getColor() != null) return false;
        return !(model != null ? !model.equals(car.model) : car.model != null);

    }
//
    @Override
    public int hashCode() {

        return 5;
    }
}
