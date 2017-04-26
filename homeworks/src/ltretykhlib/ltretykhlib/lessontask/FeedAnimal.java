package ltretykhlib.ltretykhlib.lessontask;

/**
 * Created by Tretykhlib on 19.04.2017.
 */
public class FeedAnimal {
    public static void main(String[] args) {

        Animal owl = new Animal("Owl", "ants");
        Animal elephant = new Animal("Elephant", "grass");
        Animal monkey = new Animal("Monkey", "bananas");


        Animal catPetya=new Animal();
        catPetya.feed();
        catPetya.setName("Mi");
        catPetya.setFoodName("whiskas");

        owl.feed();
        elephant.feed();
        monkey.feed();
    }
}
