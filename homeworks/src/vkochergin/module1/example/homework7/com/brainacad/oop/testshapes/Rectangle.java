package vkochergin.module1.example.homework7.com.brainacad.oop.testshapes;

/**
 * Created by Volodymyr Kochergin on 30.05.2017.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcArea() {
        double area = getHeight() * getWidth();
        return area;
    }

    @Override
    public String toString() {
        return "This is " + this.getClass().getSimpleName() + ", color: " + getShapeColor()
                + ", width = " + getWidth() + ", height = " + getHeight();
    }
}
