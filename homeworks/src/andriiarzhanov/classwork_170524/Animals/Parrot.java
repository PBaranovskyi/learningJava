package andriiarzhanov.classwork_170524.Animals;

import andriiarzhanov.classwork_170524.Bird;

/**
 * Created by arzhanov on 24.05.17.
 */
public class Parrot extends Bird {
    final static String food = "grain";

    public Parrot() {
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
