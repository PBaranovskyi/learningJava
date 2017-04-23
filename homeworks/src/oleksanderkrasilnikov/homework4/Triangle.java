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

    private double A;//sideAB
    private double B;//sideAC
    private double C;//sideBC

    public Triangle() {
        System.out.println("Specify the coordinates of the vertex of the triangle");
        Scanner scan = new Scanner(System.in);
        System.out.println("Vertex A");
        System.out.println("A1 = ");
        a1 = scan.nextDouble();
        System.out.println("A2 = ");
        a1 = scan.nextDouble();
        System.out.println("Vertex B");
        System.out.println("B1 = ");
        b1 = scan.nextDouble();
        System.out.println("B2 = ");
        b1 = scan.nextDouble();
        System.out.println("Vertex C");
        System.out.println("C1 = ");
        c1 = scan.nextDouble();
        System.out.println("C2 = ");
        c1 = scan.nextDouble();

        A = lengthOfSide(a1, a2, b1, b2);
        B = lengthOfSide(a1, a2, c1, c2);
        C = lengthOfSide(b1, b2, c1, c2);
    }

    public Triangle(double a1, double a2, double b1, double b2, double c1, double c2) {
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
        this.c1 = c1;
        this.c2 = c2;

        A = lengthOfSide(a1, a2, b1, b2);
        B = lengthOfSide(a1, a2, c1, c2);
        C = lengthOfSide(b1, b2, c1, c2);
    }

    public double lengthOfSide(double x1, double y1, double x2, double y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

    public void trianglePerimeter() {
        System.out.println("This triangle perimeter is = " + (A + B + C));
    }

    public void triangleArea() {
        double p = (0.5 * (A + B + C));
        System.out.println("This triangle area is = " + sqrt(p * (p - A) * (p - B) * (p - C)));
    }

    public void triangleView() {
        if (A >= B + C || B >= A + C || C >= B + A) {
            System.out.println("This is not a triangle");
        } else if (A == sqrt(pow(B, 2) + pow(C, 2)) || B == sqrt(pow(A, 2) + pow(C, 2)) || C == sqrt(pow(B, 2) + pow(A, 2))) {
            System.out.println("Triangle is rectangular");//прямоугольный
        } else if (B == A && B == C) {
            System.out.println("Triangle is equilateral");//равносторонний
        } else if (B != A && B != C && A != C) {
            System.out.println("Triangle is versatile");//разносторонний
        } else if (A == B && A != C || B == C && B != A || C == A && C != B) {
            System.out.println("Triangle is isosceles");//равнобедренный
        } else if (A > sqrt(pow(B, 2) + pow(C, 2)) || B > sqrt(pow(A, 2) + pow(C, 2)) || C > sqrt(pow(B, 2) + pow(A, 2))) {
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
