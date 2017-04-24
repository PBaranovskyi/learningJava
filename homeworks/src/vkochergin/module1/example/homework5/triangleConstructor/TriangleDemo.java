package vkochergin.module1.example.homework5.triangleConstructor;

/**
 * Created by Volodymyr Kochergin on 23.04.2017.
 */
public class TriangleDemo {
    public static void main(String[] args) {

        TrianglePoint a = new TrianglePoint(2, 2);
        TrianglePoint b = new TrianglePoint(3, 5);
        TrianglePoint c = new TrianglePoint(4, 2);

        TrianglePoint d = new TrianglePoint(2, 4);
        TrianglePoint e = new TrianglePoint(4, 4);
        TrianglePoint f = new TrianglePoint(2, 4);

        Triangle triangle1 = new Triangle(a, b, c);
        triangle1.print();
        System.out.println("Triangle1 perimeter is: " + triangle1.perimeter());
        System.out.println("Triangle1 square is: " + triangle1.square());

        Triangle triangle2 = new Triangle(d, e, f);


    }
}
