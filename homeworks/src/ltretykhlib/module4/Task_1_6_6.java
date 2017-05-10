package ltretykhlib.module4;

import java.util.Arrays;

/**
 * Created by Tretykhlib on 04.05.2017.
 */
public class Task_1_6_6 {

    public static void main(String[] args) {
        int arr[] = {5, -3, 5, -108, 1, 2, 9};

        int i, j, swap;

        for (i = 1; i < arr.length; i++) {
            for (j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

}

