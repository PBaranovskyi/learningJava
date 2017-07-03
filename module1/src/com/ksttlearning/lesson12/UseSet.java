package com.ksttlearning.lesson12;

import com.ksttlearning.lesson3.Car;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by citsym on 14.06.17.
 */
public class UseSet {

    public static void main(String[] args) {
        Set<Car> cars = new HashSet<>();

        Car blue1 = new Car("Blue", 3);
        Car blue2 = new Car("Blue", 3);

        System.out.println("Equals : "  + blue1.equals(blue2));

        cars.add(blue1);
        blue1.setColor("Black");
        cars.add(new Car("Red", 3));
        cars.add(new Car("Yellow", 2));
        cars.add(blue2);

        for (Car car : cars) {
            System.out.println(car);
        }




    }
}
