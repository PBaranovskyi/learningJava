package andriiarzhanov.module8.MyShapes;

/**
 * Created by arzhanov on 24.05.17.
 */
public class Circle extends Shape {
    private double radius;
    static double PI = 3.14;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calsArea() {
        return PI * Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return "This is Circle, color: " + getShapeColor() + ", radius=" + getRadius();
    }
}
