package andriiarzhanov.classwork_170605;

/**
 * Created by arzhanov on 05.06.17.
 */
public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        setRadius(radius);
    }

    public double getArea() {
        return PI * Math.pow(getRadius(), 2);
    }

    public double getPerimeter() {
        return 2 * PI * getRadius();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + getRadius() + ", which is a subclass of " + super.toString();
    }
}
