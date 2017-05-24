package andriiarzhanov.module8.MyShapes;

/**
 * Created by arzhanov on 24.05.17.
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("BLUE");
        System.out.println("This is " + shape.toString());
        System.out.println("Shape area is: " + shape.calsArea());

        Circle circle = new Circle("GREEN", 10);
        System.out.println("This is " + circle.toString());
        System.out.println("Shape area is: " + circle.calsArea());

        Rectangle rectangle = new Rectangle("RED", 11, 22);
        System.out.println("This is " + rectangle.toString());
        System.out.println("Shape area is: " + rectangle.calsArea());

        Triangle triangle = new Triangle("BLACK", 5, 5, 5);
        System.out.println("This is " + triangle.toString());
        System.out.println("Shape area is: " + triangle.calsArea());

        Shape[] shapes = new Shape[9];
        shapes[0] = new Circle("BLUE", 5);
        shapes[1] = new Circle("GREY", 15);
        shapes[2] = new Rectangle("YELLOW", 12, 8);
        shapes[3] = new Rectangle("WHITE", 5, 7);
        shapes[4] = new Rectangle("PURPLE", 2, 4);
        shapes[5] = new Rectangle("VIOLET", 3, 6);
        shapes[6] = new Rectangle("BLACK", 6, 11);
        shapes[7] = new Triangle("ORANGE", 2, 2, 3);
        shapes[8] = new Triangle("PINK", 4, 3, 6);

        printShapes(shapes);
        System.out.println("Total area is: " + sumArea(shapes));
        System.out.println("Area of triangles is: " + sumTriangleArea(shapes));
        System.out.println("Area of rectangles is: " + sumRectangleArea(shapes));
        System.out.println("Area of circles is: " + sumCircleArea(shapes));
    }

    private static void printShapes(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString() + ", area is: " + shapes[i].calsArea());
        }
    }

    private static double sumArea(Shape[] shapes) {
        double sumArea = 0.;
        for (int i = 0; i < shapes.length; i++) {
            sumArea += shapes[i].calsArea();
        }
        return sumArea;
    }

    private static double sumRectangleArea(Shape[] shapes) {
        double sumArea = 0.;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Rectangle)
                sumArea += shapes[i].calsArea();
        }
        return sumArea;
    }

    private static double sumCircleArea(Shape[] shapes) {
        double sumArea = 0.;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle)
                sumArea += shapes[i].calsArea();
        }
        return sumArea;
    }

    private static double sumTriangleArea(Shape[] shapes) {
        double sumArea = 0.;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Triangle)
                sumArea += shapes[i].calsArea();
        }
        return sumArea;
    }
}
