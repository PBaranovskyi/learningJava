package andriiarzhanov.classwork_170524.Animals;

import andriiarzhanov.classwork_170524.Bird;

/**
 * Created by arzhanov on 24.05.17.
 */
public class Owl extends Bird {
    final static String food = "mouse";

    public Owl() {
        setFoodName(this.food);
    }

    @Override
    protected void eat() {
        System.out.println(getClass().getSimpleName() + " eats " + food);
    }

    @Override
    protected void fly() {
        System.out.println(getClass().getSimpleName() + " can fly!");
    }
}
