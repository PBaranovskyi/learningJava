package ua.kstt.justymenko.shapes;

/**
 * Created by Ustymenko on 05/31/17.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 3.14 * Math.pow(getRadius(), 2);
    }
}
