package ua.kstt.justymenko.module08.MyShapes;

/**
 * Created by n1kropol on 5/24/17.
 */
public class Shape {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return "Shape, color is " + shapeColor;
    }

    public double calcArea(){
        return 0;
    }
}
