package kpobozhny.homework.labwork_2_7.labwork_2_7_6;

/**
 * Created by kostya on 5/28/17.
 */
public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

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

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", color is: "+getShapeColor()+", a="+a+", b="+b+", c="+c;
    }

    @Override
    public double calcArea() {

        double s=(this.a+this.b+this.c)/2;

        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }



}
