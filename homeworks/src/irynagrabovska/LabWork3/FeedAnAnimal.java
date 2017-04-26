package irynagrabovska.LabWork3;

/**
 * Created by whisper on 19-Apr-17.
 */
public class FeedAnAnimal {
    public static void main(String[] args) {
       Animal owl = new Animal("owl", "mouse");
       owl.feed();
       Animal elefant = new Animal("elefant", "bananas");
       elefant.feed();
       Animal cat = new Animal("cat", "meat");
       cat.feed();
    }
}
