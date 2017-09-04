package ua.kstt.justymenko.shapes;

import java.util.ArrayList;

/**
 * Created by Ustymenko on 05/31/17.
 */
public class Main {

    public static double sumOfAreas(ArrayList<Shape> shapes){
        double sum = 0.0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }
    public static void main(String[] args) {
        Circle circle1 = new Circle(4.0);
        Circle circle2 = new Circle(6.0);
        new Circle(6.0);
        Rectangle rectangle1 = new Rectangle(1.0, 3.0);
        Rectangle rectangle2 = new Rectangle(5.0, 6.0);

        Square square1 = new Square(3.0);
        Square square2 = new Square(2.0);

        ArrayList<Shape> shapeArrayList = new ArrayList<>();
        shapeArrayList.add(circle1);
        shapeArrayList.add(circle2);
        shapeArrayList.add(rectangle1);
        shapeArrayList.add(rectangle2);
        shapeArrayList.add(square1);
        shapeArrayList.add(square2);


        for (Shape shape : shapeArrayList) {
            System.out.println(shape.getArea());
        }

        System.out.println(sumOfAreas(shapeArrayList));

    }
}
