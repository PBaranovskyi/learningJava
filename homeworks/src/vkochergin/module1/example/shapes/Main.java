package vkochergin.module1.example.shapes;

import java.util.ArrayList;

/**
 * Created by Volodymyr Kochergin on 31.05.2017.
 */
public class Main {

    public static double sumOfAreas(ArrayList<Shape> list) {
        double totalArea = 0.0;
        for (Shape shape : list) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }

    public static void main(String[] args) {
        Shape circle1 = new Circle(10.0);
        Shape circle2 = new Circle(20.0);
        Shape rectangle = new Rectangle(5, 8);
        Shape square = new Square(15);
        Shape square2 = new Square(20);

        ArrayList<Shape> listOfShapes = new ArrayList<>();
        listOfShapes.add(circle1);
        listOfShapes.add(circle2);
        listOfShapes.add(rectangle);
        listOfShapes.add(square);
        listOfShapes.add(new Square(20));

        System.out.println(sumOfAreas(listOfShapes));
    }
}
