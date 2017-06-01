package ilyarogachov.homework6.Classwork;

import ilyarogachov.classwork.Reptile;

import java.util.ArrayList;

/**
 * Created by rogachev on 31.05.17.
 */
public class Main {
    public static void main(String[] args) {
        Reatangle regt = new Reatangle(4,7);
        Circle cirk = new Circle(5);
        Squears squer = new Squears(25);
        Circle cirkas = new Circle(55);
        Circle cirkasb = new Circle(57);

        ArrayList<Shape> shapelist = new ArrayList<>();
        shapelist.add(regt);
        shapelist.add(cirk);
        shapelist.add(squer);
        shapelist.add(cirkas);
        shapelist.add(cirkas);
        shapelist.add(cirkasb);
        double sum = 0;
        for (Shape shape : shapelist) {
            sum = sum+shape.getArea();
            System.out.println(shape.getArea());

        }
        System.out.println("Summa = " + sum);


    }
}
