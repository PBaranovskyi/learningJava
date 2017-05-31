package com.ksttlearning.practice10;


import com.ksttlearning.lesson3.Animal;

import java.util.ArrayList;

/**
 * Created by citsym on 24.05.17.
 */
public class Zoo {

    public static int countOfAnimals = 0;

    public static void main(String[] args) {

        Snake lucy = new Snake("lucy");
        Snake olya = new Snake("olya");
        CrocodileOur gena = new CrocodileOur();
        Owl owlTanya = new Owl("tanya");
        Parrot kesha = new Parrot("kesha");

        Bird sonOfKesha = kesha.createFromEgg();
        if (sonOfKesha instanceof Parrot) {
            System.out.println("New parrot was born");
        }

        //=================
        Bird sonOfOwl = owlTanya.createFromEgg();
        sonOfOwl.fly();
        sonOfOwl.feed();

        if (sonOfOwl instanceof Owl) {
            System.out.println("New owl was born");
        }
        // =================

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(lucy);
        animals.add(gena);
        animals.add(owlTanya);
        animals.add(kesha);
        animals.add(olya);
//        animals.add(null);
//        animals.add("Some Text");
//        animals.add(123213);

        animals.add(1, new Snake("Masha"));

        for (int i = 0; i < animals.size(); i++) {
            Animal item = animals.get(i);
            item.feed();
        }
        feedListOfAnimals(animals);


        ArrayList<Reptile> reptileList = new ArrayList<>();
        reptileList.add(gena);
        reptileList.add(lucy);

        feedListOfAnimals(reptileList);



//        letsFly(animals);
//        feedAllAnimals(animals);

        System.out.println(Animal.getAnimalsCount());

    }

    private static void feedListOfAnimals(ArrayList<? extends Animal> animals) {

        for (Animal item : animals) {
            item.feed();
            System.out.println(item);
        }

    }


    static void letsFly(Animal[] animals) {

        for (Animal animal : animals) {
            if (animal instanceof Bird) {
                Bird bird = (Bird) animal;
                bird.fly();
            }
        }

    }

    static void feedAllAnimals(ArrayList<Reptile> animals) {

        for (Animal animal : animals) {
            animal.feed();
        }
    }
}
