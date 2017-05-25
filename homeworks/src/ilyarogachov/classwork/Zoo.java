package ilyarogachov.classwork;

import ilyarogachov.homework1.LabWork144;

/**
 * Created by rogachev on 24.05.17.
 */
public class Zoo {

    public static void main(String[] args) {
        Parrot parrotJora = new Parrot();
        Monkey monkeyBonua = new Monkey();
        Crock crockVasua = new Crock();
        Elephand elephandElla = new Elephand();
        Owl owlKusha = new Owl();
        Shake shakeShh = new Shake();

        Animal [] animals = new Animal[6];
        animals[0] = parrotJora;
        animals[1] = monkeyBonua;
        animals[2] = crockVasua;
        animals[3] = elephandElla;
        animals[4] = owlKusha;
        animals[5] = shakeShh;
        feedAllAnimals(animals);
        letsFly(animals);
        System.out.println(Animal.countofanimals());
    }

    static void letsFly(Animal[] animals){

        for (Animal animal1 : animals) {
            if(animal1 instanceof Bird){

                Bird birds = (Bird) animal1;
                birds.fly();
            }
        }

    }

    static void feedAllAnimals(Animal[] animals){
        for (Animal animal : animals) {
            animal.eat();
        }

    }
}
