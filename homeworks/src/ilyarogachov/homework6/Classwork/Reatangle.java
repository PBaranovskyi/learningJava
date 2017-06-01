package ilyarogachov.homework6.Classwork;

/**
 * Created by rogachev on 31.05.17.
 */
public class Reatangle extends Shape {
    double a;
    double b;

    public Reatangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return this.a*this.b;
    }
}
