package ua.kstt.justymenko.lessonAnimal;

/**
 * Created by Ustymenko on 04/19/17.
 */
public class FeedAnimals {

    public static void main(String[] args) {
        Animal owl = new Animal("Owl", "Mice");
        Animal elephant = new Animal("Elephant", "grass");
        Animal monkey = new Animal("Monkey", "banana");

        owl.feedAnimal();
        elephant.feedAnimal();
        monkey.feedAnimal();
    }

}
