package com.ksttlearning.lesson12;

import com.ksttlearning.lesson3.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by citsym on 14.06.17.
 */
public class UseMap {
    public static void main(String[] args) {

        Map<Car, String> map = new HashMap<>();

        map.put(new Car("Red", "Nissan", 2), "Super Nissan");
//        map.put(new Car("Red", "Nissan", 2), "Nissan");
        map.put(new Car("Black", "Nissan", 2), "Nissan");

        Car key = new Car("Blue", "Nissan", 2);
        map.put(key, "Nissan");

        map.put(new Car("Red", "Porsche", 3), "Porsche");
        map.put(new Car("Red", "Lada", 1), "Lada");

        System.out.println(" model of someCar is "  + map.get(new Car("Red", "Nissan", 2)));



    }
}
