package ua.kstt.justymenko.module08.MyShapes;

/**
 * Created by n1kropol on 5/24/17.
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("RED");
        System.out.println("This is " + shape.toString());
        System.out.println("Shape area is: " + shape.calcArea());
    }
}
