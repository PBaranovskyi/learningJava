package ua.kstt.justymenko.module10.shapes;

import java.util.ArrayList;

/**
 * Created by n1kropol on 6/1/17.
 */
public class CalculateAreas {
    public static void main(String[] args) {
        ArrayList<Shape> shapeArrayList = new ArrayList<>();
        shapeArrayList.add(new Circle("red", true, 2.5));
        shapeArrayList.add(new Circle(4.4));
        shapeArrayList.add(new Rectangle(1.2,2.3, "blue", true));
        shapeArrayList.add(new Rectangle());
        shapeArrayList.add(new Rectangle(3.4,4.1));
        shapeArrayList.add(new Square(5.5));
        shapeArrayList.add(new Square(2.2, "green", false));

        for (Shape shape : shapeArrayList) {
            System.out.println(shape.toString());
        }
    }
}
