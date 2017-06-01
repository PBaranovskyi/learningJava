package oleksanderkrasilnikov.lesson6;

/**
 * Created by Krasilnikov on 31.05.2017.
 */
public class Rectangle extends Shape {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
