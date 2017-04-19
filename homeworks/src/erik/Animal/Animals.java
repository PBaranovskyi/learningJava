package erik.Animal;

/**
 * Created by Erik Pavliuk on 19/04/2017.
 */
public class Animals {
    private String name;
    private String foodname;

    public Animals(String name, String foodname){
        this.name = name;
        this.foodname = foodname;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setFoodname(String foodname){
        this.foodname = foodname;
    }

    public void feed() {
        System.out.println(name + " eating " + foodname);
    }


}
