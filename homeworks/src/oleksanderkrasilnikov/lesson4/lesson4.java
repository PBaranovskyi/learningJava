package oleksanderkrasilnikov.lesson4;


public class lesson4 {
    public static void main(String[] args) {
        Animal owl = new Animal("Owl", "mices");
        Animal elephant = new Animal("Elephant", "grass");
        Animal monkey = new Animal("Monkey", "banana");


        owl.feed();
        elephant.feed();
        monkey.feed();
    }
}
