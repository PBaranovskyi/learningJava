package com.ksttlearning.practice10;


import com.ksttlearning.lesson3.Animal;

/**
 * Created by citsym on 24.05.17.
 */
public class Zoo {

    public static int countOfAnimals = 0;

    public static void main(String[] args) {

        Snake lucy = new Snake("lucy");
        Snake olya = new Snake("olya");
        CrocodileOur gena = new CrocodileOur();
        Owl owlTanya = new Owl();
        Parrot kesha = new Parrot();

        Bird sonOfKesha = kesha.createFromEgg();
        if (sonOfKesha instanceof Parrot){
            System.out.println("New parrot was born");
        }

        //=================
        Bird sonOfOwl = owlTanya.createFromEgg();
        sonOfOwl.fly();
        sonOfOwl.feed();

        if (sonOfOwl instanceof Owl){
            System.out.println("New owl was born");
        }
        // =================

        Animal[] animals = new Animal[5];

        animals[0] = lucy;
        animals[1] = gena;
        animals[2] = owlTanya;
        animals[3] = kesha;
        animals[4] = olya;


        letsFly(animals);
        feedAllAnimals(animals);

        System.out.println(Animal.getAnimalsCount());

    }


    static void letsFly(Animal[] animals){

        for (Animal animal : animals) {
            if (animal instanceof Bird){
                Bird bird = (Bird) animal;
                bird.fly();
            }
        }

    }

    static void feedAllAnimals(Animal[] animals){

        for (Animal animal : animals) {
            animal.feed();
        }
    }
}
