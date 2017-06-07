package oleksanderkrasilnikov.homework8;

/**
 * Created by Krasilnikov on 07.06.2017.
 */
public class Rectangle extends Shape{


    private double width;
    private double height;

    public Rectangle(String shapeColor, double height, double width) {
        super(shapeColor);
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "This is Rectangle, color is:" + getShapeColor() + ", height = " + height + ", width = " + width;
    }

    @Override
    public double calcArea() {
        return height*width;
    }
}
