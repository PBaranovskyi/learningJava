package com.ksttlearning.lesson8;

import com.ksttlearning.lesson8.zoo.Crocodile;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by citsym on 12.06.17.
 */
public class UseInterfaces {

    public static void main(String[] args) {

        Robot robot = new Robot();

        CanBeFunWith bird = new Crocodile();

        CanEat[] objectses = new CanEat[2];
        objectses[0] = robot;
//        objectses[1] = bird;

//        feedAllThatCanEat(objectses);


//        ArrayList<CanEat> list = new ArrayList<CanEat>();
//
//        list.add(robot);
////        list.add(bird);
//        list.add(new Shrek());
//
//
//        list.get(1).eat();
//
        List<CanBeFunWith> listDrinkers = new LinkedList<>();

        listDrinkers.add(bird);
        listDrinkers.add(new Shrek());

        drinkAllThatCanDrink(listDrinkers);


        letsFun(bird);
    }

    private static void letsFun(CanBeFunWith bird) {
        bird.tellAJoke();
        bird.drinkBear(10);

    }


    public static void feedAllThatCanEat(CanEat[] objects) {

        for (CanEat object : objects) {
            object.eat();
        }
    }


    public static void drinkAllThatCanDrink(List<CanBeFunWith> list) {
        for (CanBeFunWith canDrink : list) {
            canDrink.drinkBear(10);
            canDrink.tellAJoke();
        }
    }
}
