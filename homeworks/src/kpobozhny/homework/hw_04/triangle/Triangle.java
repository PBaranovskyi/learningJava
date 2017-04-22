package kpobozhny.homework.hw_04.triangle;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by kostya on 4/22/17.
 */

/*        Создайте класс треугольников на координатной плоскости,
        используя в качестве полей объекты-точки.
        Реализуйте в классе:
        а) конструктор, позволяющий задавать вершины;
        b) метод print(), выводящий описание треугольника на экран;
        c) методы для вычисления периметра и площади треугольника.
        Инкапсулируйте поля таким образом, чтобы нельзя было изменить значение любого из них так,
        чтобы вершины оказались на одной прямой.*/

public class Triangle {

    private Point A, B, C;

    public Triangle(Point a, Point b, Point c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }

    public Point getVertexA() {
        return A;
    }

    public void setVertexA(Point point) {
        if (((B.getX() == point.getX()) && (C.getX() == point.getX())) ||
                ((B.getY() == point.getY()) && (C.getY() == point.getY()))) {
            System.out.println("Sorry, your coordinates are invalid (All triangle's vertices can not belong to the same line)!");
        } else {
            this.A = point;
        }

    }

    public Point getVertexB() {
        return B;
    }

    public void setVertexB(Point point) {
        if (((A.getX() == point.getX()) && (C.getX() == point.getX())) ||
                ((A.getY() == point.getY()) && (C.getY() == point.getY()))) {
            System.out.println("Sorry, your coordinates are invalid (All triangle's vertices can not belong to the same line)!");
        } else {
            this.B = point;
        }

    }

    public Point getVertexC() {
        return C;
    }

    public void setVertexC(Point point) {
        if (((A.getX() == point.getX()) && (B.getX() == point.getX())) ||
                ((A.getY() == point.getY()) && (B.getY() == point.getY()))) {
            System.out.println("Sorry, your coordinates are invalid (All triangle's vertices can not belong to the same line)!");
        } else {
            this.C = point;
        }
    }

    public void print() {
        System.out.println("Triangle ABC:");
        System.out.println("A(" + getVertexA().getX() + "; " + getVertexA().getY() + ")");
        System.out.println("B(" + getVertexB().getX() + "; " + getVertexB().getY() + ")");
        System.out.println("C(" + getVertexC().getX() + "; " + getVertexC().getY() + ")");
        System.out.println("******************************");
        //System.out.println("ABC Perimeter: " + getPerimeter());
        //System.out.println("ABC Square: " + getSquare());
        System.out.println("ABC Perimeter: " + String.format("%.2f", getPerimeter()));
        System.out.println("ABC Square: " + String.format("%.2f", getSquare()));
    }

    private double getSideLength(Point point1, Point point2) {

        return Math.sqrt(Math.pow((point1.getX() - point2.getX()), 2) + Math.pow((point1.getY() - point2.getY()), 2));
    }

    public double getPerimeter() {
        return getSideLength(getVertexA(), getVertexB()) +
                getSideLength(getVertexB(), getVertexC()) +
                getSideLength(getVertexC(), getVertexA());
    }

    // Heron's formula
    public double getSquare() {
        double semiPerimeter = getPerimeter() / 2;

        return Math.sqrt(semiPerimeter *
                (semiPerimeter - getSideLength(getVertexA(), getVertexB())) *
                (semiPerimeter - getSideLength(getVertexB(), getVertexC())) *
                (semiPerimeter - getSideLength(getVertexC(), getVertexA())));
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 10), new Point(10, 0));
        triangle.print();

        //try to update a vertex with incorrect coordinates
        System.out.println();
        System.out.println("******************************");
        triangle.setVertexC(new Point(0,5));
    }


}
