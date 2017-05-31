package vkochergin.module1.example.homework7.com.brainacad.oop.testshapes;

/**
 * Created by Volodymyr Kochergin on 30.05.2017.
 */
public class Circle extends Shape{
    private double radius;

    public Circle(String shapeColor, Double radius) {
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
    public double calcArea() {
        double area = Math.PI * Math.sqrt(getRadius());
        return area;
    }

    @Override
    public String toString() {
        return "This is: " + this.getClass().getSimpleName() + ", " + "color is: " + getShapeColor()
                + ", radius = " + getRadius();
    }
}
