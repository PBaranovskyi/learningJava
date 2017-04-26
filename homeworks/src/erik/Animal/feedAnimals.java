package erik.Animal;

/**
 * Created by Erik Pavliuk on 19/04/2017.
 */
public class feedAnimals {
    public static void main(String[] args) {


        Animals monkey = new Animals("Monkey","Elephant" );
        Animals elephant = new Animals("Elephant", "water");
        Animals owl = new Animals("Owl", "mouse");

        monkey.setName("Mon");
        monkey.setFoodname("`hant");

        elephant.setName("Elephant");
        elephant.setFoodname("water");

        owl.setName("Owl");
        owl.setFoodname("mouse");

        owl.feed();
        elephant.feed();
        monkey.feed();
    }

}
