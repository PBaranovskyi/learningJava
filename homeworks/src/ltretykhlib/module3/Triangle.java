package ltretykhlib.module3;

import static java.lang.Math.*;

/**
 * Created by Tretykhlib on 23.04.2017.
 */
public class Triangle {
    private double Ax;
    private double Ay;
    private double Bx;
    private double By;
    private double Cx;
    private double Cy;

    public Triangle(double axTop, double ayTop, double bxTop, double byTop, double cxTop, double cyTop) {
        Ax = axTop;
        Ay = ayTop;
        Bx = bxTop;
        By = byTop;
        Cx = cxTop;
        Cy = cyTop;
    }

    public void setAx(double ax) {
        Ax = ax;
    }

    public void setAy(double ay) {
        Ay = ay;
    }

    public void setBx(double bx) {
        Bx = bx;
    }

    public void setBy(double by) {
        By = by;
    }

    public void setCx(double cx) {
        Cx = cx;
    }

    public void setCy(double cy) {
        Cy = cy;
    }

    public double getAx() {
        return Ax;
    }

    public double getAy() {
        return Ay;
    }

    public double getBx() {
        return Bx;
    }

    public double getCx() {
        return Cx;
    }

    public double getBy() {
        return By;
    }

    public double getCy() {
        return Cy;
    }

    public void view() {
        if (abLength() + bcLength() == acLength() || abLength() + acLength() == bcLength() || bcLength() + acLength() == abLength()) {
            System.out.println("Triangle's tops on one line, enter another values");
        } else {
            System.out.println(abLength());
            System.out.println(acLength());
            System.out.println(bcLength());
        }
    }

    public double abLength() {
        double abLengthCalculated = sqrt(pow(Bx - Ax, 2) + pow(By - Ay, 2));
        return abLengthCalculated;
    }

    public double acLength() {
        double acLengthCalculated = sqrt(pow(Cx - Ax, 2) + pow(Cy - Ay, 2));
        return acLengthCalculated;
    }


    public double bcLength() {
        double bcLengthCalculated = sqrt(pow(Cx - Bx, 2) + pow(Cy - By, 2));
        return bcLengthCalculated;
    }


    public double perimeter() {
        double trianglePerimeter = abLength() + acLength() + bcLength();
        System.out.println("Perimeter: " + trianglePerimeter);
        return trianglePerimeter;
    }

    public double square() {
        double halfOfPerimeter = perimeter() / 2;
        double triangleSquare = sqrt(halfOfPerimeter * (halfOfPerimeter - abLength()) * (halfOfPerimeter - acLength()) * (halfOfPerimeter - bcLength()));
        System.out.println("Square: " + triangleSquare);
        return triangleSquare;
    }

}