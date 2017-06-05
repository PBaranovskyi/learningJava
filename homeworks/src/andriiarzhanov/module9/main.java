package andriiarzhanov.module9;

/**
 * Created by arzhanov on 05.06.17.
 */
public class main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape shape1 = new Shape("yellow", false);

        System.out.println(shape);
        System.out.println(shape1);
        shape.setColor("blue");
        shape.setFilled(false);
        System.out.println(shape);

        Circle circle = new Circle();
        Circle circle1 = new Circle("grey", true, 5);

        System.out.println(circle.toString() + "; area: " + circle.getArea() + "; perimeter: " + circle.getPerimeter());
        System.out.println(circle1.toString() + "; area: " + circle1.getArea() + "; perimeter: " + circle1.getPerimeter());

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle("blue", false, 2, 3);
        System.out.println(rectangle.toString() + "; area: " + rectangle.getArea() + "; perimeter: " + rectangle.getPerimeter());
        System.out.println(rectangle1.toString() + "; area: " + rectangle1.getArea() + "; perimeter: " + rectangle1.getPerimeter());

        Square square = new Square();
        Square square1 = new Square(3);
        Square square2 = new Square("yellow", true, 4);
        System.out.println(square.toString() + "; area: " + square.getArea() + "; perimeter: " + square.getPerimeter());
        System.out.println(square1.toString() + "; area: " + square1.getArea() + "; perimeter: " + square1.getPerimeter());
        System.out.println(square2.toString() + "; area: " + square2.getArea() + "; perimeter: " + square2.getPerimeter());

        Rectangle square3 = new Square(4);
        System.out.println(square3.toString() + "; area: " + square3.getArea() + "; perimeter: " + square3.getPerimeter());

    }
}
