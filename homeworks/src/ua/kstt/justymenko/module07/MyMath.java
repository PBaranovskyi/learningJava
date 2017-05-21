package ua.kstt.justymenko.module07;

import java.util.Arrays;

/**
 * Created by n1kropol on 5/21/17.
 */
public class MyMath {
    public static void main(String[] args) {
        int[] array = {0, 1, -1, 3, 5};
        System.out.println("Max: " + findMax(array));
        System.out.println("Min: " + findMin(array));
    }

    public static int findMax(int[] array){
        return Arrays.stream(array).min().getAsInt();
    }

    public static int findMin(int[] array){
        return Arrays.stream(array).max().getAsInt();
    }
}
