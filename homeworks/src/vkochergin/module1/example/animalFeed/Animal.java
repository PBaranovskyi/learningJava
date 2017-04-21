package vkochergin.module1.example.animalFeed;

/**
 * Created by Volodymyr Kochergin on 19.04.2017.
 */
public class Animal {
    private String name;
    private String foodName;


    public Animal(String animalName, String foodName){
        this.name = animalName;
        this.foodName = foodName;
    }

    public void feed() {
        System.out.println(name + " eats " + foodName);
    }
}
