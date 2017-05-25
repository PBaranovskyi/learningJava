package kpobozhny.homework.labwork_2_7.labwork_2_7_6;

/**
 * Created by Kostiantyn Pobozhni on 25.05.2017.
 */
public class Circle extends Shape {
    private double radius;

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
    public String toString() {
        return getClass().getSimpleName() + ", color is: "+getShapeColor()+", radius="+radius;
    }

    @Override
    public double calcArea() {

        return Math.PI*Math.pow(radius,2);
    }
}
