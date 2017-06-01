package ua.kstt.justymenko.module10;

/**
 * Created by n1kropol on 5/30/17.
 */
public class Circle extends Shape{
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * this.getRadius();
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + this.getRadius() +
                ", which is a subclass of " + super.toString();
    }
}
