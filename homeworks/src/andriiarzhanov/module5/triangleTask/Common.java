package andriiarzhanov.module5.triangleTask;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by arzhanov on 25.04.17.
 */
public class Common {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] points = new int[6];

        for (int i = 0; i < points.length; i++) {
            System.out.println("Please enter number");
            points[i] = scan.nextInt();
        }

        Point a = new Point(points[0], points[1]);
        Point b = new Point(points[2], points[3]);
        Point c = new Point(points[4],points[5]);

        try {
            Triangle triangle = new Triangle(a,b,c);
            triangle.print();
            System.out.println("Perimeter: "+triangle.getPerimeter());
            System.out.println("Square: "+triangle.getSquare());
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
