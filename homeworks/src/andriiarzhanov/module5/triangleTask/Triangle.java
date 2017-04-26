package andriiarzhanov.module5.triangleTask;

import java.awt.*;

/**
 * Created by arzhanov on 25.04.17.
 */
public class Triangle {
    Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        if ((a.x == b.x && b.x == c.x) || (a.y == b.y && b.y == c.y)) {
            this.a = a;
            this.b = b;
            this.c = c;
            print();
            throw new ArithmeticException("Triangle can not have all points on one line!");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public void print() {
        System.out.println("Point a:" + getPointString(a) + ";b:" + getPointString(b) + ";c:" + getPointString(c));
    }

    private String getPointString(Point p) {
        return "{" + p.x + "," + p.y + "}";
    }

    public double getSquare() {
        return (double) Math.abs(((a.x - c.x) * (b.y - c.y) - (b.x - c.x) * (a.y - c.y)) / 2);
    }

    public double getPerimeter() {

        double distanceAB = Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
        double distanceAC = Math.sqrt(Math.pow((c.x - a.x), 2) + Math.pow((c.y - a.y), 2));
        double distanceBC = Math.sqrt(Math.pow((b.x - c.x), 2) + Math.pow((b.y - c.y), 2));

        return distanceAB + distanceAC + distanceBC;
    }
}
