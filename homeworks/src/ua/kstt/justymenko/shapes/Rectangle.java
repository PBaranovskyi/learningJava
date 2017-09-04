package ua.kstt.justymenko.shapes;

/**
 * Created by Ustymenko on 05/31/17.
 */
public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
