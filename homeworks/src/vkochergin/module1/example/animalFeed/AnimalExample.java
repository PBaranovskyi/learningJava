package vkochergin.module1.example.animalFeed;

/**
 * Created by Volodymyr Kochergin on 19.04.2017.
 */
public class AnimalExample {

    public static void main(String[] args) {
        Animal owl = new Animal("owl", "mouse");
        owl.feed();

        Animal elephant = new Animal("elephant", "grass");
        elephant.feed();

        Animal monkey = new Animal("monkey", "banana");
        monkey.feed();

    }
}
