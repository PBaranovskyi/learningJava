package ua.kstt.justymenko.Zoo;

/**
 * Created by Ustymenko on 05/24/17.
 */
public class Owl extends Bird {
    @Override
    public String eat() {
        return getClass().getSimpleName() + ", eats mices";
    }
}
