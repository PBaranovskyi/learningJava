package ltretykhlib.ltretykhlib.lessontask;


/**
 * Created by Tretykhlib on 19.04.2017.
 */
public class Animal {
    private String name;
    private String foodName;


    public Animal(String animalName, String animalFood) {
        name=animalName; // the same as  this.name = animalName;
        this.foodName = animalFood;
    }
    public Animal(){

    }

    public void feed() {
        System.out.println("Feed " + this.name + " with " + this.foodName);
    }

    public String getName() {
        return name;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
