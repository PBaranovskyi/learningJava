package ilyarogachov.homework6.Classwork;

/**
 * Created by rogachev on 31.05.17.
 */
public class Circle  extends Shape{
    double radius;
    public Circle(double rad) {
        this.radius = rad;
    }

    @Override
    public double getArea () {
        return 3.14*this.radius;
    }
}
