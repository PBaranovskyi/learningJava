package ltretykhlib.module4;

import java.util.Arrays;

/**
 * Created by Tretykhlib on 02.05.2017.
 */
public class Task_1_6_4 {
    public static void main(String[] args) {
        int arr[] = {8, 24, 185, 0, 31};
        Arrays.sort(arr);
        for (int item : arr) {
            System.out.println(item);
        }
        int valueToFind = 31;

        int match = Arrays.binarySearch(arr, valueToFind);

        System.out.println("Result: " + match);
    }
}

