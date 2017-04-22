package andriiarzhanov.module4;

/**
 * Created by arzhanov on 19.04.17.
 */
public class Animal {
    private String name;
    private String food;

    Animal (String name, String food) {
        this.name = name;
        this.food = food;
    }

    public void feed() {
        System.out.println(name + " eats " + food);
    }


}
