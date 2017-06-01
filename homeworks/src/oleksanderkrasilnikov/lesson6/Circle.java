package oleksanderkrasilnikov.lesson6;

import static java.lang.Math.sqrt;

/**
 * Created by Krasilnikov on 31.05.2017.
 */
public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * sqrt(radius);
    }
}
