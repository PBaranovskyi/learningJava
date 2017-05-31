package oleksanderkrasilnikov.lesson6;


import java.util.Arrays;

public class Zoo {
    public static void main(String[] args) {
        Snake bob = new Snake("Bob","mice");
        Owl ted = new Owl("Ted","humans");
        Crocodile ben = new Crocodile("Ben","cows");
        Monkey george = new Monkey("George","bananas");
        Elephant steave = new Elephant("Steave","grass");
        Parrot den = new Parrot("Den","carrot");

        Animal[] animals = new Animal[0];

        animals = addAnimalToArray(animals, bob);
        animals = addAnimalToArray(animals, ted);
        animals = addAnimalToArray(animals, ben);
        animals = addAnimalToArray(animals, george);
        animals = addAnimalToArray(animals, steave);
        animals = addAnimalToArray(animals, den);



        feedAllAnimals(animals);
        System.out.println(Animal.getAnimalsCount());
    }

    public static void feedAllAnimals(Animal[] arr) {
        for (Animal animal : arr) {
            animal.feed();
        }
    }

    public static Animal[] addAnimalToArray(Animal[] oldArray, Animal newElement) {
        int length = oldArray.length;
        Animal[] newAnimals = Arrays.copyOf(oldArray, length + 1);
        newAnimals[newAnimals.length - 1] = newElement;
        return newAnimals;
    }
}
