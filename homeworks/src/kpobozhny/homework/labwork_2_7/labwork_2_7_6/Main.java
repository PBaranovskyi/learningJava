package kpobozhny.homework.labwork_2_7.labwork_2_7_6;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Kostiantyn Pobozhni on 25.05.2017.
 */
public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape("RED");
        System.out.println("This is "+shape);
        System.out.println(shape.getClass().getSimpleName()+" area is: "+String.format("%.0f", shape.calcArea()));
        System.out.println("--------------------------");
        Circle circle = new Circle("GREEN", 10);
        System.out.println("This is "+circle);
        System.out.println(circle.getClass().getSimpleName()+" area is: "+String.format("%.5f", circle.calcArea()));
        System.out.println("--------------------------");
        Rectangle rectangle = new Rectangle("BLUE", 5, 6);
        System.out.println("This is "+rectangle);
        System.out.println(rectangle.getClass().getSimpleName()+" area is: "+String.format("%.5f", rectangle.calcArea()));
        System.out.println("--------------------------");
        Triangle triangle = new Triangle("BLACK", 2, 3, 4);
        System.out.println("This is "+triangle);
        System.out.println(triangle.getClass().getSimpleName()+" area is: "+String.format("%.5f", triangle.calcArea()));
        System.out.println("");

        Shape[] arr={new Rectangle("BLUE", 5, 6),
                    new Rectangle("GREY", 4, 10),
                    new Triangle("BLACK", 2, 3, 4),
                    new Rectangle("YELLOW", 2, 4),
                    new Triangle("PINK", 5, 7, 3),
                    new Circle("GREEN", 11),
                    new Rectangle("RED", 6, 7),
                    new Rectangle("WHITE", 4, 9),
                    new Circle("PURPLE", 5)};
        double area=0;
        double sumArea=0;
        double sumRectArea=0;
        double sumTriangleArea=0;
        double sumCircleArea=0;
        for (Shape elem : arr) {
            if (elem instanceof Rectangle){
                Rectangle rec = (Rectangle)elem;
                area=rec.calcArea();
                System.out.println("This is "+rec+", area is: "+String.format("%.5f", area));
                sumRectArea+=area;
            }else if (elem instanceof Triangle){
                Triangle tr = (Triangle) elem;
                area=tr.calcArea();
                System.out.println("This is "+tr+", area is: "+String.format("%.5f", area));
                sumTriangleArea+=area;
            }else if (elem instanceof Circle){
                Circle ci = (Circle) elem;
                area=ci.calcArea();
                System.out.println("This is "+circle+", area is: "+String.format("%.5f", area));
                sumCircleArea+=area;
            }else{
                area=elem.calcArea();
                System.out.println("This is "+elem+", area is: "+String.format("%.0f", area));
            }
            sumArea+=area;

        }
        System.out.println("----------------------------------");
        System.out.println("Rectangles total area: "+String.format("%.5f", sumRectArea));
        System.out.println("Circles total area: "+String.format("%.5f", sumCircleArea));
        System.out.println("Triangles total area: "+String.format("%.5f", sumTriangleArea));
    }



}

