package com.ksttlearning.lesson8.zoo;

/**
 * Created by Volodymyr Kochergin on 24.05.2017.
 */
public class Zoo {

    public static void main(String[] args) {
        Crocodile gena = new Crocodile();
        Snake galya = new Snake();
        Monkey vasya = new Monkey();
        Elephant eduard = new Elephant();
        Owl olya = new Owl();
        Parrot kolya = new Parrot();
        Parrot parrot = new Parrot();


        Animal[] animals = new Animal[7];
        animals[0] = gena;
        animals[1] = galya;
        animals[2] = vasya;
        animals[3] = eduard;
        animals[4] = olya;
        animals[5] = kolya;
        animals[6] = parrot;

        feedAllAnimals(animals);
        System.out.println();
        letsFly(animals);
        System.out.println(Animal.getAnimalsCount());
    }

    public static void feedAllAnimals(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
        }
    }

    static void letsFly(Animal[] animals){
        for(Animal animal : animals){
            if (animal instanceof Bird){
                Bird bird = (Bird) animal;
                bird.fly();
            }
        }
    }


}
