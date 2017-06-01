package vkochergin.module1.example.shapes;

/**
 * Created by Volodymyr Kochergin on 31.05.2017.
 */
public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

}
