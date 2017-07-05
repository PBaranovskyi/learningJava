package andriiarzhanov.module8.MyShapes;

/**
 * Created by arzhanov on 24.05.17.
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
        return "This is Triangle, color: " + getShapeColor() + ", a=" + getA() + ", b=" + getB() + ", c=" + getC();
    }

    @Override
    public double calsArea() {
        double s = getA() + getB() + getC() / 2;
        return Math.sqrt(s * (s - getA()) * (s - getB()) * (s - getC()));
    }
}
