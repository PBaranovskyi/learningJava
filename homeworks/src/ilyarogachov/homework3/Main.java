package ilyarogachov.homework3;

/**
 * Created by rogachev on 25.04.17.
 */
public class Main {

    public static void main(String[] args) {
        Point one = new Point(1,1);
        Point two = new Point(-2,4);
        Point three = new Point(-2,-2);
        Triangle triangle = new Triangle(one, two, three);
        double ploshad = Calculator.calculateArea(triangle);
        System.out.println("Ploshad = " + ploshad);
        double perimetr = Calculator.calculatePerimetr(triangle);
        System.out.println("Perimetr = " + perimetr);
        System.out.println("Done");

    }
}
