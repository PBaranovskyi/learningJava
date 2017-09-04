package ua.kstt.justymenko.lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Created by Ustymenko on 07/24/17.
 */
public class Main implements Comparator<Integer>{

    public static void main(String[] args) {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (100 - 1));
        }
        Arrays.sort(arr, new Main());

        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        int one = o1.intValue() % 2;
        int two = o2.intValue() % 2;
        if (one == 0 && two == 0){
            return 0;
        }

        if (one != 0 && two == 0){
            return 1;
        }

        if (one == 0 && two != 0){
            return -1;
        }

        return 0;
    }


}
