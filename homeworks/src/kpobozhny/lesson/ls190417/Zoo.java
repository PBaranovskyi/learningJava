package kpobozhny.lesson.ls190417;

/**
 * Created by Kostiantyn Pobozhni on 19.04.2017.
 */
public class Zoo {

    public static void main(String[] args) {
        Animal owl = new Animal("Owl", "mice");
        Animal elephant = new Animal("Elephant", "grass");
        Animal monkey = new Animal("Monkey", "banana");

        owl.feed();
        elephant.feed();
        monkey.feed();
    }
}
