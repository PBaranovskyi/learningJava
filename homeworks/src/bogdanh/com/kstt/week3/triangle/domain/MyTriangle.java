package bogdanh.com.kstt.week3.triangle.domain;


public class MyTriangle {

    private final MyPoint vertex1;
    private final MyPoint vertex2;
    private final MyPoint vertex3;

    public MyTriangle(MyPoint vertex1, MyPoint vertex2, MyPoint vertex3) {
        if (!isValid(vertex1, vertex2, vertex3))
            throw new IllegalArgumentException("Provided coordinates don't form a triangle");
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }

    private boolean isValid(MyPoint vertex1, MyPoint vertex2, MyPoint vertex3) {
        double side1 = Math.abs(vertex1.distance(vertex2));
        double side2 = Math.abs(vertex2.distance(vertex3));
        double side3 = Math.abs(vertex3.distance(vertex1));

        return side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2;
    }

    public MyPoint getVertex1() {
        return vertex1;
    }

    public MyPoint getVertex2() {
        return vertex2;
    }

    public MyPoint getVertex3() {
        return vertex3;
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "vertex1=" + vertex1 +
                ", vertex2=" + vertex2 +
                ", vertex3=" + vertex3 +
                '}';
    }
}