package bogdanh.com.kstt.week3.triangle.formula;

import bogdanh.com.kstt.week3.triangle.domain.MyPoint;
import bogdanh.com.kstt.week3.triangle.domain.MyTriangle;

import java.util.function.Function;

public enum TriangleFormula {

    AREA(triangle -> {
        MyPoint vertex1 = triangle.getVertex1();
        MyPoint vertex2 = triangle.getVertex2();
        MyPoint vertex3 = triangle.getVertex3();

        double a = Math.abs(vertex1.distance(vertex2));
        double b = Math.abs(vertex2.distance(vertex3));
        double c = Math.abs(vertex3.distance(vertex1));
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }),
    PERIMETER(triangle -> {
        MyPoint vertex1 = triangle.getVertex1();
        MyPoint vertex2 = triangle.getVertex2();
        MyPoint vertex3 = triangle.getVertex3();

        double a = Math.abs(vertex1.distance(vertex2));
        double b = Math.abs(vertex2.distance(vertex3));
        double c = Math.abs(vertex3.distance(vertex1));
        return a + b + c;
    });

    private final Function<MyTriangle, Double> formula;

    TriangleFormula(Function<MyTriangle, Double> formula) {
        this.formula = formula;
    }

    public Function<MyTriangle, Double> getFormula() {
        return formula;
    }
}