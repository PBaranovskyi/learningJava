package oleksanderkrasilnikov.lesson6;

import java.util.ArrayList;

/**
 * Created by Krasilnikov on 31.05.2017.
 */
public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(8);
        Square square = new Square(9);
        Rectangle rectangle = new Rectangle(7, 5);

        ArrayList<Shape> listOfShapes = new ArrayList<>();

        listOfShapes.add(circle);
        listOfShapes.add(square);
        listOfShapes.add(rectangle);

        System.out.println(sumOfArias(listOfShapes));

    }


    public static double sumOfArias(ArrayList<Shape> listOfShapes) {
        double sum = 0.0;
        for (Shape listOfShape : listOfShapes) {
            sum += listOfShape.getArea();
        }
        return sum;
    }
}
