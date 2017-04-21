package andriiarzhanov.module4;

/**
 * Created by arzhanov on 19.04.17.
 */
public class Common {
    public static void main(String[] args) {
        Animal owl = new Animal("Owl", "mouses");
        Animal dog = new Animal("Dog", "meat");
        Animal cat = new Animal("Cat", "kitykat");

        owl.feed();
        dog.feed();
        cat.feed();
    }
}
