package ua.kstt.justymenko.Zoo;

/**
 * Created by Ustymenko on 05/24/17.
 */
public class Elephant extends Mammal {
    @Override
    public String eat() {
        return getClass().getSimpleName() + ", eats grass";
    }
}
