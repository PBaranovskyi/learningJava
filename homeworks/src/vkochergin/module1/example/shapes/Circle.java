package vkochergin.module1.example.shapes;

/**
 * Created by Volodymyr Kochergin on 31.05.2017.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
