package kpobozhny.homework.labwork_1_6;

import java.util.Arrays;

/**
 * Created by kostya on 4/30/17.
 */

/*Task:
        Write a program that sorts an array of average temperature values by months of 2015  as follows:
        at first the negative values, then - positive values*/

public class labwork_1_6_6 {

    static void sort(int[] array) {

        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    //array[i] = 0;
                }

            }
        }


    }

    public static void main(String[] args) {
        int[] temperature2015 = {-10, -12, 4, 12, 20, 23, 24, 20, 15, 9, 0, -14};

        System.out.println("Initial array:");
        for (int i = 0; i < temperature2015.length; i++) {

            System.out.print(temperature2015[i] + " | ");


        }
        System.out.println();
        System.out.println();
        sort(temperature2015);
        System.out.println("Sorted array:");
        for (int i = 0; i < temperature2015.length; i++) {

            System.out.print(temperature2015[i] + " | ");

        }
        System.out.println();

    }
}
