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
        Owl owl = new Owl();
        Parrot kesha = new Parrot();

        Animal[] animals = new Animal[5];

        animals[0] = lucy;
        animals[1] = gena;
        animals[2] = owl;
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
