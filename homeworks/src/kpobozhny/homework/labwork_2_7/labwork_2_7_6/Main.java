package kpobozhny.homework.labwork_2_7.labwork_2_7_6;

/**
 * Created by Kostiantyn Pobozhni on 25.05.2017.
 */
public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape("RED");
        System.out.println("This is "+shape);
        System.out.println(shape.getClass().getSimpleName()+" area is: "+String.format("%.0f", shape.calcArea()));

        Circle circle = new Circle("GREEN", 10);
        System.out.println("This is "+circle);
        System.out.println(circle.getClass().getSimpleName()+" area is: "+String.format("%.5f", circle.calcArea()));
    }

}

