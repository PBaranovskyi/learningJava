package ua.kstt.justymenko.module08.MyShapes;

/**
 * Created by n1kropol on 5/24/17.
 */
public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle, " +
                "color: " + getShapeColor() +
                ", width = " + width +
                ", height = " + height;
    }
}
