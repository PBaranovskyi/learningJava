package com.ksttlearning.lesson5;

import com.ksttlearning.lesson3.Car;

import java.util.Arrays;

/**
 * Created by citsym on 26.04.17.
 */
public class ClassWork {

    public static void main(String[] args) {

        Car[] carArray = new Car[0];

        carArray = addCarToArray(carArray, new Car("Yellow"));
        carArray = addCarToArray(carArray, new Car("Red"));


//        ClassWork cl = new ClassWork();
        carArray = addCarToArray(carArray, new Car("Orange"));
        carArray = addCarToArray(carArray, new Car("Black"));
        carArray = addCarToArray(carArray, new Car("Pink"));
        carArray = addCarToArray(carArray, new Car("White"));
        carArray = addCarToArray(carArray, new Car("Brown"));


        for (Car car : carArray) {
            if (car != null) {
                System.out.println(car.getColor());
            }
        }


        Integer integer = Integer.valueOf("234324");
        Integer number = 45;
        int number1 = 45;

        int max = Integer.max(integer, number);

        double value1 = 0.00000006;
        double value2 = 0.00000006;

        Integer valueInt = 104;

        increment(valueInt);

        if (Double.compare(value1, value2) == 0){
            System.out.println("equals");
        }


        // 0

        // Array of cars - with 3 cars

        // Add fourth car with specific method addCarToArray(carArray, newCar)

    }


    public static int increment(int value){
        return value++;
    }

    public static Car[] addCarToArray(Car[] oldArray, Car newElement) {

        int length = oldArray.length;

        if (length != 0 && oldArray[length - 1] == null) {
            for (int i = length - 1; i >= 0; i--) {
                if (oldArray[i] != null) {
                    oldArray[i + 1] = newElement;
                    return oldArray;
                }
            }
        }

        Car[] newCars = Arrays.copyOf(oldArray, length + 1);
        newCars[newCars.length - 1] = newElement;
        return newCars;
    }


}
