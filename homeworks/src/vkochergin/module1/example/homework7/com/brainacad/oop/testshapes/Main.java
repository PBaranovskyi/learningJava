package vkochergin.module1.example.homework7.com.brainacad.oop.testshapes;

/**
 * Created by Volodymyr Kochergin on 30.05.2017.
 */
public class Main {
    static double sumArea = 0.0;
    static double sumRectArea = 0.0;
    static double sumTriangleArea = 0.0;
    static double sumCircleArea = 0.0;

    public static void main(String[] args) {
        Shape shape = new Shape("RED");
        System.out.println(shape.toString());

        Shape greenCircle = new Circle("GREEN", 10.0);
        System.out.println(greenCircle.toString());
        System.out.println("Shape area is: " + greenCircle.calcArea());

        Shape redRectangle = new Rectangle("RED", 11.0, 22.0);
        System.out.println(redRectangle.toString());
        System.out.println("Shape area is: " + redRectangle.calcArea());

        Shape blackTriangle = new Triangle("BLACK", 5, 5, 5);
        System.out.println(blackTriangle.toString());
        System.out.println("Shape area is: " + blackTriangle.calcArea());

        Shape blueRectangle = new Rectangle("BLUE", 10.0, 20.0);
        Shape greenRectangle = new Rectangle("GREEN", 20.0, 30.0);
        Shape whiteRectangle = new Rectangle("WHITE", 70.0, 90.0);
        Shape violetRectangle = new Rectangle("VIOLET", 33.0, 44.0);

        Shape redCircle = new Circle("RED", 22.0);

        Shape yellowTriangle = new Triangle("YELLOW", 10.0, 10.0, 10.0);

        Shape[] arr = new Shape[9];
        arr[0] = redRectangle;
        arr[1] = blueRectangle;
        arr[2] = greenRectangle;
        arr[3] = whiteRectangle;
        arr[4] = violetRectangle;
        arr[5] = greenCircle;
        arr[6] = redCircle;
        arr[7] = blackTriangle;
        arr[8] = yellowTriangle;

        System.out.println();

        for (Shape element : arr) {
            System.out.println(element.toString());
            sumArea += element.calcArea();

            if (element instanceof Rectangle) {
                sumRectArea += element.calcArea();
            }

            if (element instanceof Circle) {
                sumCircleArea += element.calcArea();
            }

            if (element instanceof Triangle) {
                sumTriangleArea += element.calcArea();
            }
        }

        System.out.println("Total area: " + sumArea);
        System.out.println("Rectangles total area: " + sumRectArea);
        System.out.println("Circle total area: " + sumCircleArea);
        System.out.println("Triangle total area: " + sumTriangleArea);
    }
}
