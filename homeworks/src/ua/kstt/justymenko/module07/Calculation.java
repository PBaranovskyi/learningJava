package ua.kstt.justymenko.module07;

import java.util.Arrays;

import static ua.kstt.justymenko.module07.MyMath.*;

/**
 * Created by n1kropol on 5/21/17.
 */
public class Calculation {
    public static void main(String[] args) {
        int[] minArray = new int[10];
        int[] maxArray = new int[10];


        for (int i = 0; i < 10; i++) {
            minArray[i] = (int) (Math.random() * 100);
            maxArray[i] = (int) (Math.random() * 100);
        }

        System.out.println("minArray: " + Arrays.toString(minArray));
        System.out.println(findMax(minArray));
        System.out.println("maxArray: " + Arrays.toString(maxArray));
        System.out.println(findMin(maxArray));

//        minArray: [33, 35, 79, 47, 98, 25, 2, 97, 13, 13]
//        2
//        maxArray: [5, 33, 36, 78, 13, 64, 38, 94, 23, 36]
//        94
    }
}
