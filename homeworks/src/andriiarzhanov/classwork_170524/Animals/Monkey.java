package andriiarzhanov.classwork_170524.Animals;

import andriiarzhanov.classwork_170524.Mammel;

/**
 * Created by arzhanov on 24.05.17.
 */
public class Monkey extends Mammel {
    final static String food = "bananas";

    public Monkey() {
        setFoodName(this.food);
    }

    @Override
    protected void eat() {
        System.out.println(getClass().getSimpleName() + " eats " + food);
    }
}
