package kpobozhny.lesson.ls190417;

/**
 * Created by Kostiantyn Pobozhni on 19.04.2017.
 */
public class Animal {

    private String name;
    private String foodName;

    public Animal(String name, String foodName){
        this.name=name;
        this.foodName=foodName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void feed(){
        System.out.println(this.name + " eats " + this.foodName +".");
    }


}
