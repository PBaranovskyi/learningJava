package com.ksttlearning.lesson11;

import java.util.ArrayList;

/**
 * Created by citsym on 31.05.17.
 */
public class CalculateAreas {

    public static void main(String[] args) {


        ArrayList<Shape> listOfShapes = new ArrayList<>();

        Shape circle = new Circle(10);
        listOfShapes.add(circle);
        listOfShapes.add(new Circle(123));
        listOfShapes.add(new Circle(123));
        listOfShapes.add(new Circle(123));
        listOfShapes.add(new Circle(123));
        listOfShapes.add(new Circle(1));
        listOfShapes.add(new Circle(5));
        listOfShapes.add(new Circle(8));
        listOfShapes.add(new Rectangle(8, 6));
        listOfShapes.add(new Rectangle(2, 5));
        listOfShapes.add(new Square(60));



        while (listOfShapes.remove(new Circle(123))){
//
        }


        boolean contains = listOfShapes.contains(new Square(60));
        System.out.println("Contains : " + contains );

        double sumOfAreas =  sumOfAreas(listOfShapes);
        System.out.println("Sum of areas : " + sumOfAreas );


    }

    private static double sumOfAreas(ArrayList<Shape> listOfShapes) {
        double sum = 0;

        for (Shape item : listOfShapes) {
            sum += item.getArea();
            System.out.println("I am adding " +item.getArea() + " of " + item.toString());
        }

        return sum;
    }


}
