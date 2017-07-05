package oleksanderkrasilnikov.homework8;

import static java.lang.Math.*;

/**
 * Created by Krasilnikov on 07.06.2017.
 */
public class Circle extends Shape {

    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * sqrt(radius);
    }

    @Override
    public String toString() {
        return "This is Circle, color is:" + getShapeColor() + ", radius = " + radius;
    }
}
