package andriiarzhanov.classwork_170524;

import andriiarzhanov.classwork_170524.Animals.*;

/**
 * Created by arzhanov on 24.05.17.
 */
public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[7];

        animals[0] = new Crocodile();
        animals[1] = new Elephant();
        animals[2] = new Monkey();
        animals[3] = new Owl();
        animals[4] = new Parrot();
        animals[5] = new Snake();


        System.out.println("Animal count: " + Animal.getAnimalCount());
        letsFly(animals);
        feedAllAnimals(animals);
        System.out.println("Total count of animals: " + countAnimals(animals));
    }

    private static void letsFly(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal instanceof Bird) {
                ((Bird) animal).fly();
            }
        }
    }

    private static void feedAllAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal != null)
                animal.eat();
        }
    }

    @Deprecated
    /**
     * For count of animals use Animal.getAnimalCount()
     */
    private static int countAnimals(Animal[] animals) {
        int count = 0;
        for (Animal animal : animals) {
            if (animal != null)
                count++;
        }
        return count;
    }
}
