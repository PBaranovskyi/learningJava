package com.ksttlearning.lesson4;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by citsym on 24.04.17.
 */
public class UseArrays {

    public static void main(String[] args) {

        int[] intArray = new int[10];

        for (int i = 0; i < intArray.length; i++) {

            if (i == 8) {
                continue;
            }

            System.out.println("index: " + i);

            int item = intArray[i];
            {
                System.out.println("array element: " + item);
            }
        }

        for (int item : intArray) {

            System.out.println(item);

        }

        Object someObject = new Object();

        System.out.println("Some obj " +someObject);


        Random random = new Random();

        for (int i = 0; i < intArray.length; i++) {

            intArray[i] = random.nextInt(50);
        }

        int[] notSortedArray = Arrays.copyOf(intArray, intArray.length);

        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(notSortedArray));





    }
}
