package ua.kstt.justymenko.module08.MyShapes;

/**
 * Created by n1kropol on 5/24/17.
 */
public class Main {

    public static void main(String[] args) {
        Shape[] arr = new Shape[10];
        double sumArea = 0;
        double sumRectArea = 0;
        double sumTriangleArea = 0;
        double sumCircleArea = 0;

        Shape circle1 = new Circle("GREEN", 5.0);
        Shape circle2 = new Circle("Amazon", 6.0);

        Shape rectangle1 = new Rectangle("RED", 11.0, 22.0);
        Shape rectangle2 = new Rectangle("Amaranth", 12.0, 23.0);
        Shape rectangle3 = new Rectangle("Pink", 13.0, 24.0);
        Shape rectangle4 = new Rectangle("Auburn", 14.0, 25.0);
        Shape rectangle5 = new Rectangle("Awesome", 15.0, 26.0);

        Shape triangle1 = new Triangle("BLACK", 5.0, 5.0, 5.0);
        Shape triangle2 = new Triangle("Arsenic", 6.0, 6.0, 6.0);
        Shape triangle3 = new Triangle("Dark Chocolate", 7.0, 7.0, 7.0);

        arr[0] = circle1;
        arr[1] = circle2;
        arr[2] = rectangle1;
        arr[3] = rectangle2;
        arr[4] = rectangle3;
        arr[5] = rectangle4;
        arr[6] = rectangle5;
        arr[7] = triangle1;
        arr[8] = triangle2;
        arr[9] = triangle3;

        for (Shape figure: arr) {
            System.out.println("This is " + figure.toString());
            sumArea += figure.calcArea();
            if (figure instanceof Rectangle)
                sumRectArea += figure.calcArea();
            if (figure instanceof Triangle)
                sumTriangleArea += figure.calcArea();
            if (figure instanceof Circle)
                sumCircleArea += figure.calcArea();
        }
        System.out.println("Total area: " + sumArea);
        System.out.println("Rectangles total area: " + sumRectArea);
        System.out.println("Circle total area: " + sumCircleArea);
        System.out.println("Triangle total area: " + sumTriangleArea);
    }
}
