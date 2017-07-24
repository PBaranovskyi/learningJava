package com.ksttlearning.lesson16;

/**
 * Created by citsym on 10.07.17.
 */
public class UseGenerics {

    public static void main(String[] args) {


        Integer[] array_1 = {284, 234, 1, 3, 23, 43};
        Double[] array_2 = {34.0, 233.0, 1.0, 3.0, 23.0, 43.0};

        // Lab 2_14_3
        System.out.println("-----------------------------------------------");
        System.out.println("Sum of elements that are greater than 75: " +
                calcSum(array_1, 75));
        System.out.println("Sum of elements that are greater than 75: " +
                calcSum(array_2, 75.0));

    }


    // lab 2_14_3
    public static <T extends Number & Comparable> T calcSum(T[] array, T maxval) {
        Double sum = 0.0;
        for (T element : array)
            if (element.compareTo(maxval) > 0)
                sum += element.doubleValue();
        return (T) sum;
    }

}
