package vkochergin.module1.example.homework7.com.brainacad.oop.testshapes;

/**
 * Created by Volodymyr Kochergin on 30.05.2017.
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double s = (getA() + getB() + getC()) / 2;
        double area = Math.sqrt(s * (s - getA()) * (s - getB()) * (s - getC()));
        return area;
    }

    @Override
    public String toString() {
        return "This is " + this.getClass().getSimpleName() + ", color: " + getShapeColor()
                + ", a = " + getA() + ", b = " + getB() + ", c = " + getC();
    }


}
