package oleksanderkrasilnikov.homework8;

/**
 * Created by Krasilnikov on 07.06.2017.
 */
public class Shape {
    private String shapeColor;

    private double area = 0.0;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public double calcArea() {
        return area;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    @Override
    public String toString() {
        return "Shape,color is:" + shapeColor;
    }
}
