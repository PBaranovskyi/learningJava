package oleksanderkrasilnikov.lesson4;


public class Animal {
    private String name;
    private String foodName;

    public Animal(String name, String foodName) {
        this.name = name;
        this.foodName = foodName;
    }

    public void feed() {
        System.out.println(name + " eats " + foodName);
    }
}
