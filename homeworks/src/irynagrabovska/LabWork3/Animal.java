package irynagrabovska.LabWork3;

/**
 * Created by whisper on 19-Apr-17.
 */
public class Animal {
    public String name;
    public String foodname;
    public Animal(String name, String foodname){
        this.name = name;
        this.foodname = foodname;
    }
    public void feed(){
        System.out.println(name + " eats " + foodname);
    }
}
