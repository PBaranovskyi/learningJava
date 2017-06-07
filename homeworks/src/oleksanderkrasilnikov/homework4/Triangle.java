package oleksanderkrasilnikov.homework4;

import static java.lang.Math.*;

import java.util.Scanner;

public class Triangle {

    private double a1;
    private double a2;
    private double b1;
    private double b2;
    private double c1;
    private double c2;

    private double a;//sideAB
    private double b;//sideAC
    private double c;//sideBC

    public Triangle() {
        System.out.println("Specify the coordinates of the vertex of the triangle");
        Scanner scan = new Scanner(System.in);
        System.out.println("Vertex a");
        System.out.println("A1 = ");
        a1 = scan.nextDouble();
        System.out.println("A2 = ");
        a1 = scan.nextDouble();
        System.out.println("Vertex b");
        System.out.println("B1 = ");
        b1 = scan.nextDouble();
        System.out.println("B2 = ");
        b1 = scan.nextDouble();
        System.out.println("Vertex c");
        System.out.println("C1 = ");
        c1 = scan.nextDouble();
        System.out.println("C2 = ");
        c1 = scan.nextDouble();

        a = lengthOfSide(a1, a2, b1, b2);
        b = lengthOfSide(a1, a2, c1, c2);
        c = lengthOfSide(b1, b2, c1, c2);
    }

    public Triangle(double a1, double a2, double b1, double b2, double c1, double c2) {
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
        this.c1 = c1;
        this.c2 = c2;

        a = lengthOfSide(a1, a2, b1, b2);
        b = lengthOfSide(a1, a2, c1, c2);
        c = lengthOfSide(b1, b2, c1, c2);
    }

    public double lengthOfSide(double x1, double y1, double x2, double y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

    public void trianglePerimeter() {
        System.out.println("This triangle perimeter is = " + (a + b + c));
    }

    public void triangleArea() {
        double p = (0.5 * (a + b + c));
        System.out.println("This triangle area is = " + sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    public void triangleView() {
        if (a >= b + c || b >= a + c || c >= b + a) {
            System.out.println("This is not a triangle");
        } else if (a == sqrt(pow(b, 2) + pow(c, 2)) || b == sqrt(pow(a, 2) + pow(c, 2)) || c == sqrt(pow(b, 2) + pow(a, 2))) {
            System.out.println("Triangle is rectangular");//прямоугольный
        } else if (b == a && b == c) {
            System.out.println("Triangle is equilateral");//равносторонний
        } else if (b != a && b != c && a != c) {
            System.out.println("Triangle is versatile");//разносторонний
        } else if (a == b && a != c || b == c && b != a || c == a && c != b) {
            System.out.println("Triangle is isosceles");//равнобедренный
        } else if (a > sqrt(pow(b, 2) + pow(c, 2)) || b > sqrt(pow(a, 2) + pow(c, 2)) || c > sqrt(pow(b, 2) + pow(a, 2))) {
            System.out.println("Triangle is obtuse");//тупоугольный
        } else {
            System.out.println("Triangle is acute");//остроугольный
        }
    }

    public static void main(String[] args) {
        //Triangle triangle = new Triangle();
        //triangle.triangleView();
        //triangle.triangleArea();

        Triangle triangle2 = new Triangle(1, 1, 3, 1, 3, 4);
        triangle2.triangleView();
        triangle2.trianglePerimeter();
        triangle2.triangleArea();
    }

}
