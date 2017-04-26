package bogdanh.com.kstt.week3.triangle;

import bogdanh.com.kstt.week3.triangle.calculators.Calculator;
import bogdanh.com.kstt.week3.triangle.domain.MyPoint;
import bogdanh.com.kstt.week3.triangle.domain.MyTriangle;

import static bogdanh.com.kstt.week3.triangle.formula.TriangleFormula.AREA;
import static bogdanh.com.kstt.week3.triangle.formula.TriangleFormula.PERIMETER;

public class TriangleRun {

    public static void main(String[] args) {

        MyTriangle triangle = new MyTriangle(new MyPoint(-2, -3), new MyPoint(2, 1), new MyPoint(5, -2));

        System.out.println(triangle.toString());

        double area = Calculator.calculate(triangle, AREA.getFormula());
        double perimeter = Calculator.calculate(triangle, PERIMETER.getFormula());
        System.out.println("area of triangle is " + area);
        System.out.println("perimeter of triangle is " + perimeter);
    }
}
