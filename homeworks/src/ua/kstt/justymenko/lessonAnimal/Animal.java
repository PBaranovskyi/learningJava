package ua.kstt.justymenko.lessonAnimal;

/**
 * Created by Ustymenko on 04/19/17.
 */
public class Animal {
    private String name;
    private String foodName;

    public Animal(String name, String foodName) {
        this.name = name;
        this.foodName = foodName;
    }

    public void feedAnimal(){
        System.out.println(name + " eats " + foodName);
    }
}
