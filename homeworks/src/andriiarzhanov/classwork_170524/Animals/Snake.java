package andriiarzhanov.classwork_170524.Animals;

import andriiarzhanov.classwork_170524.Reptile;

/**
 * Created by arzhanov on 24.05.17.
 */
public class Snake extends Reptile {
    final static String food = "mouse";

    public Snake() {
        setFoodName(this.food);
    }

    @Override
    protected void eat() {
        System.out.println(getClass().getSimpleName() + " eats " + food);
    }
}
