package oleksanderkrasilnikov.lesson5;

public class Car {
    private String color = "white";
    private String model = "NISSAN JUKE";

    public Car (){
    }

    public Car(String color) {
        this.color = color;
    }

    public void setColor(String inputColor) {
        color = inputColor;
    }
    public String getColor() {
        return this.color;
    }
}
