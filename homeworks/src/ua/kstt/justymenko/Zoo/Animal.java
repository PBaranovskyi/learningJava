package ua.kstt.justymenko.Zoo;

/**
 * Created by Ustymenko on 05/24/17.
 */
public class Animal {
    public static int animalAmount;
    public String eat(){
        return "I'm animal, and can eat";
    }

    public Animal() {
        animalAmount++;
    }
}
