package vkochergin.module1.example.homework5.triangleConstructor;

/**
 * Created by Volodymyr Kochergin on 23.04.2017.
 */
public class Triangle {
    private TrianglePoint a;
    private TrianglePoint b;
    private TrianglePoint c;

    private double ab;
    private double ac;
    private double bc;

    public Triangle(TrianglePoint a, TrianglePoint b, TrianglePoint c) {
        this.a = a;
        this.b = b;
        this.c = c;

        if (a.getX() == b.getX() && b.getX() == c.getX()) {
            System.out.println("All points are on the same line.");
            System.out.println("Points: Xa: " + a.getX() + " Xb: " + b.getX() + " Xc: " + c.getX());

        } else if (a.getY() == b.getY() && b.getY() == c.getY()) {
            System.out.println("All points are on the same line.");
            System.out.println("Points: Ya: " + a.getY() + " Yb: " + b.getY() + " Yc: " + c.getY());
        }

        drawLines();
    }

    public double perimeter() {
        double trianglePerimeter = ab + ac + bc;
        return trianglePerimeter;
    }

    public double square() {
        double halfPerimeter = perimeter() / 2;
        double triangleSquare = Math.sqrt(halfPerimeter * (halfPerimeter - bc) * (halfPerimeter - ac) *
                (halfPerimeter - ab));
        return triangleSquare;
    }

    private void drawLines() {
        ab = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
        ac = Math.sqrt(Math.pow(c.getX() - a.getX(), 2) + Math.pow(c.getY() - a.getY(), 2));
        bc = Math.sqrt(Math.pow(c.getX() - b.getX(), 2) + Math.pow(c.getY() - b.getY(), 2));

    }

    public void print() {
        System.out.println("Triangle lines are: ab: " + ab + ", " + "bc: " + bc + ", " + "ac: " + ac);
        System.out.println("Triangle points are: Xa: " + a.getX() + " Xb: " + b.getX() + " Xc: " + c.getX() +
                " Ya: " + a.getY() + " Yb: " + b.getY() + " Yc: " + c.getY());
    }
}
