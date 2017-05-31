package oleksanderkrasilnikov.lesson6;


public class Animal {

    protected String name;
    protected String food;


    private static int animalsCount;

    public Animal(String name, String food) {
        this.name = name;
        this.food = food;
        animalsCount++;
    }

    public static int getAnimalsCount() {
        return animalsCount;
    }

    public void feed() {
        System.out.println(name + " eats " + food);
    }
}
