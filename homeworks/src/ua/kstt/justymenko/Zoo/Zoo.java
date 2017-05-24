package ua.kstt.justymenko.Zoo;

import static ua.kstt.justymenko.Zoo.Animal.*;

/**
 * Created by Ustymenko on 05/24/17.
 */
public class Zoo {

    public static void feedAllAnimals(Animal[] animals){
        for (Animal animal : animals) {
            System.out.println(animal.eat());
        }
    }

    public static void birdsFly(Animal[] animals){
        for (Animal animal : animals) {
            if (animal instanceof Bird)
                ((Bird) animal).letFly();
        }
    }

    public static void main(String[] args) {
        Crocodile crocodileGosha = new Crocodile();
        Snake snake = new Snake();
        Monkey monkey = new Monkey();
        Elephant elephant = new Elephant();
        Parrot parrot = new Parrot();
        Owl owl = new Owl();

        Animal[] zooArray = new Animal[6];
        zooArray[0] = crocodileGosha;
        zooArray[1] = snake;
        zooArray[2] = monkey;
        zooArray[3] = elephant;
        zooArray[4] = parrot;
        zooArray[5] = owl;

        feedAllAnimals(zooArray);
        birdsFly(zooArray);

        System.out.println(animalAmount);
    }
}
