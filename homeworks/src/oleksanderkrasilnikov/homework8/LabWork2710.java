package oleksanderkrasilnikov.homework8;

import java.util.Arrays;

/**
 * Created by Krasilnikov on 07.06.2017.
 */
public class LabWork2710 {
    public static void main(String[] args) {
        Shape[] arr = new Shape[0];
        double sumArea = 0;
        double sumRectArea = 0;
        double sumTriangleArea = 0;
        double sumCircleArea = 0;

        arr = addShapeToArray(arr, new Rectangle("BLACK",12,22));
        arr = addShapeToArray(arr, new Rectangle("YELLOW", 22,33));
        arr = addShapeToArray(arr, new Rectangle("GREEN", 27,53));
        arr = addShapeToArray(arr, new Rectangle("WHITE", 22,13));
        arr = addShapeToArray(arr, new Rectangle("PINK", 12,37));

        arr = addShapeToArray(arr, new Triangle("PURPLE", 8,8,8));
        arr = addShapeToArray(arr, new Triangle("YELLOW", 2,3,2));

        arr = addShapeToArray(arr, new Circle("RED", 33));
        arr = addShapeToArray(arr, new Circle("BLUE", 2233));

        for (Shape shape : arr) {
            sumArea+=shape.calcArea();
            if (shape instanceof Rectangle)
                sumRectArea += shape.calcArea();
            if (shape instanceof Triangle)
                sumTriangleArea += shape.calcArea();
            if (shape instanceof Circle)
                sumCircleArea += shape.calcArea();
            System.out.println(shape.toString() + ", area is: " + shape.calcArea());
        }
        System.out.println("Rectangles total area: " + sumRectArea);
        System.out.println("Circle total area: " + sumCircleArea);
        System.out.println("Triangle total area: " + sumTriangleArea);
    }

    public static Shape[] addShapeToArray(Shape[] array, Shape newShape) {
        Shape[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = newShape;
        return newArray;
    }
}
